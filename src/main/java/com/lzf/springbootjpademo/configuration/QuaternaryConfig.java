package com.lzf.springbootjpademo.configuration;

import com.alibaba.druid.pool.DruidDataSource;
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
 * 第四的数据源配置
 * <br/>
 * Created in 2019-08-31 13:02
 *
 * @author Zhenfeng Li
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "quaternaryEntityManagerFactory",
        transactionManagerRef = "quaternaryTransactionManager",
        //设置Repository所在位置
        basePackages = {"com.lzf.springbootjpademo.quaternary.repository"})
public class QuaternaryConfig {

    private Logger logger = LoggerFactory.getLogger(TertiaryConfig.class);

    private final JpaProperties jpaProperties;
    private final DataSource quaternaryDataSource;
    /**
     * 获取对应的数据库方言
     */
    @Value("${spring.jpa.hibernate.quaternary.database-platform}")
    private String hibernateDialect;

    @Autowired
    public QuaternaryConfig(JpaProperties jpaProperties, @Qualifier("quaternaryDataSource") DataSource quaternaryDataSource) {
        this.jpaProperties = jpaProperties;
        this.quaternaryDataSource = quaternaryDataSource;
    }

    @Bean(name = "quaternaryEntityManager")
    public EntityManager quaternaryEntityManager(EntityManagerFactoryBuilder builder) {
        return Objects.requireNonNull(quaternaryEntityManagerFactory(builder).getObject()).createEntityManager();
    }

    @Bean(name = "quaternaryEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean quaternaryEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        dataSourceInfo();
        return builder
                .dataSource(quaternaryDataSource)
                .properties(getVendorProperties())
                //设置实体类所在位置
                .packages("com.lzf.springbootjpademo.quaternary.entity")
                .persistenceUnit("quaternaryPersistenceUnit")
                .build();
    }

    private Map<String, Object> getVendorProperties() {
        Map<String, Object> hibernateProperties = jpaProperties.getHibernateProperties(new HibernateSettings());
        hibernateProperties.put("hibernate.dialect", hibernateDialect);
        return hibernateProperties;
    }

    @Bean(name = "quaternaryTransactionManager")
    PlatformTransactionManager quaternaryTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(quaternaryEntityManagerFactory(builder).getObject());
    }
    private void dataSourceInfo() {
        DruidDataSource quaternaryDataSource = (DruidDataSource) this.quaternaryDataSource;
        String name = quaternaryDataSource.getName();
        int initialSize = quaternaryDataSource.getInitialSize();
        int maxActive = quaternaryDataSource.getMaxActive();
        int minIdle = quaternaryDataSource.getMinIdle();
        long maxWait = quaternaryDataSource.getMaxWait();
        logger.info("连接池名称：[{}]", name);
        logger.info("初始连接池数：[{}]", initialSize);
        logger.info("最大连接池数：[{}]", maxActive);
        logger.info("最小连接池数：[{}]", minIdle);
        logger.info("获取连接等待超时的时间：[{}]", maxWait);
    }

}