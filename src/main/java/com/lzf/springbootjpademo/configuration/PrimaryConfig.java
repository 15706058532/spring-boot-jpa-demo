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
import org.springframework.context.annotation.Primary;
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
 * 第一的数据源配置
 * <br/>
 * Created in 2019-08-27 23:11:54
 * <br/>
 *
 * @author Zhenfeng Li
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "primaryEntityManagerFactory",
        transactionManagerRef = "primaryTransactionManager",
        //设置Repository所在位置
        basePackages = {"com.lzf.springbootjpademo.primary.repository"})
public class PrimaryConfig {
    private Logger logger = LoggerFactory.getLogger(PrimaryConfig.class);

    /**
     * 获取对应的数据库方言
     */
    @Value("${spring.jpa.hibernate.primary.database-platform}")
    private String hibernateDialect;

    private final DataSource primaryDataSource;
    private final JpaProperties jpaProperties;

    @Autowired
    public PrimaryConfig(@Qualifier("primaryDataSource") DataSource primaryDataSource, JpaProperties jpaProperties) {
        this.primaryDataSource = primaryDataSource;
        this.jpaProperties = jpaProperties;
    }

    @Primary
    @Bean(name = "primaryEntityManager")
    public EntityManager primaryEntityManager(EntityManagerFactoryBuilder builder) {
        return Objects.requireNonNull(primaryEntityManagerFactory(builder).getObject()).createEntityManager();
    }

    @Primary
    @Bean(name = "primaryEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean primaryEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        dataSourceInfo();
        return builder
                .dataSource(this.primaryDataSource)
                .properties(getVendorProperties())
                //设置实体类所在位置
                .packages("com.lzf.springbootjpademo.primary.entity")
                .persistenceUnit("primaryPersistenceUnit")
                .build();
    }

    private Map<String, Object> getVendorProperties() {
        Map<String, Object> hibernateProperties = jpaProperties.getHibernateProperties(new HibernateSettings());
        hibernateProperties.put("hibernate.dialect", hibernateDialect);
        return hibernateProperties;
    }

    @Primary
    @Bean(name = "primaryTransactionManager")
    public PlatformTransactionManager primaryTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(primaryEntityManagerFactory(builder).getObject());
    }

    private void dataSourceInfo() {
        HikariDataSource primaryDataSource = (HikariDataSource) this.primaryDataSource;
        int minimumIdle = primaryDataSource.getMinimumIdle();
        int maximumPoolSize = primaryDataSource.getMaximumPoolSize();
        long idleTimeout = primaryDataSource.getIdleTimeout();
        String poolName = primaryDataSource.getPoolName();
        long maxLifetime = primaryDataSource.getMaxLifetime();
        logger.info("连接池名称：[{}]", poolName);
        logger.info("最大连接池数：[{}]", maximumPoolSize);
        logger.info("最小空闲连接数：[{}]", minimumIdle);
        logger.info("连接在池中空闲的最长时间：[{}]", idleTimeout);
        logger.info("连接的最长生命周期：[{}]", maxLifetime);
    }

}
