package com.lzf.springbootjpademo.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;
import java.util.Objects;

/**
 * 第二的数据源配置
 * <br/>
 * Created in 2019-08-27 23:11:54
 * <br/>
 *
 * @author Zhenfeng Li
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "secondaryEntityManagerFactory",
        transactionManagerRef = "secondaryTransactionManager",
        //设置Repository所在位置
        basePackages = {"com.lzf.springbootjpademo.secondary.repository"})
public class SecondaryConfig {

    private Logger logger = LoggerFactory.getLogger(SecondaryConfig.class);

    private final JpaProperties jpaProperties;
    private final DataSource secondaryDataSource;
    /**
     * 获取对应的数据库方言
     */
    @Value("${spring.jpa.hibernate.secondary.database-platform}")
    private String hibernateDialect;

    @Autowired
    public SecondaryConfig(JpaProperties jpaProperties, @Qualifier("secondaryDataSource") DataSource secondaryDataSource) {
        this.jpaProperties = jpaProperties;
        this.secondaryDataSource = secondaryDataSource;
    }

    @Bean(name = "secondaryEntityManager")
    public EntityManager secondaryEntityManager(EntityManagerFactoryBuilder builder) {
        return Objects.requireNonNull(secondaryEntityManagerFactory(builder).getObject()).createEntityManager();
    }

    @Bean(name = "secondaryEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean secondaryEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        dataSourceInfo();
        return builder
                .dataSource(secondaryDataSource)
                .properties(getVendorProperties())
                //设置实体类所在位置
                .packages("com.lzf.springbootjpademo.secondary.entity")
                .persistenceUnit("secondaryPersistenceUnit")
                .build();
    }

    private Map<String, Object> getVendorProperties() {
        Map<String, Object> hibernateProperties = jpaProperties.getHibernateProperties(new HibernateSettings());
        hibernateProperties.put("hibernate.dialect", hibernateDialect);
        return hibernateProperties;
    }

    @Bean(name = "secondaryTransactionManager")
    PlatformTransactionManager secondaryTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(secondaryEntityManagerFactory(builder).getObject());
    }
    private void dataSourceInfo() {
        HikariDataSource secondaryDataSource = (HikariDataSource) this.secondaryDataSource;
        int maximumPoolSize = secondaryDataSource.getMaximumPoolSize();
        int minimumIdle = secondaryDataSource.getMinimumIdle();
        String poolName = secondaryDataSource.getPoolName();
        long idleTimeout = secondaryDataSource.getIdleTimeout();
        long maxLifetime = secondaryDataSource.getMaxLifetime();
        logger.info("连接池名称：[{}]", poolName);
        logger.info("最大连接池数：[{}]", maximumPoolSize);
        logger.info("最小空闲连接数：[{}]", minimumIdle);
        logger.info("连接在池中空闲的最长时间：[{}]", idleTimeout);
        logger.info("连接的最长生命周期：[{}]", maxLifetime);
    }
}