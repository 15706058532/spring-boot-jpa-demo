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
 * 第三的数据源配置
 * <br/>
 * Created in 2019-08-31 13:02
 *
 * @author Zhenfeng Li
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "tertiaryEntityManagerFactory",
        transactionManagerRef = "tertiaryTransactionManager",
        //设置Repository所在位置
        basePackages = {"com.lzf.springbootjpademo.tertiary.repository"})
public class TertiaryConfig {

    private Logger logger = LoggerFactory.getLogger(TertiaryConfig.class);

    private final JpaProperties jpaProperties;
    private final DataSource tertiaryDataSource;
    /**
     * 获取对应的数据库方言
     */
    @Value("${spring.jpa.hibernate.tertiary.database-platform}")
    private String hibernateDialect;

    @Autowired
    public TertiaryConfig(JpaProperties jpaProperties, @Qualifier("tertiaryDataSource") DataSource tertiaryDataSource) {
        this.jpaProperties = jpaProperties;
        this.tertiaryDataSource = tertiaryDataSource;
    }

    @Bean(name = "tertiaryEntityManager")
    public EntityManager tertiaryEntityManager(EntityManagerFactoryBuilder builder) {
        return Objects.requireNonNull(tertiaryEntityManagerFactory(builder).getObject()).createEntityManager();
    }

    @Bean(name = "tertiaryEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean tertiaryEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        dataSourceInfo();
        return builder
                .dataSource(tertiaryDataSource)
                .properties(getVendorProperties())
                //设置实体类所在位置
                .packages("com.lzf.springbootjpademo.tertiary.entity")
                .persistenceUnit("tertiaryPersistenceUnit")
                .build();
    }

    private Map<String, Object> getVendorProperties() {
        Map<String, Object> hibernateProperties = jpaProperties.getHibernateProperties(new HibernateSettings());
        hibernateProperties.put("hibernate.dialect", hibernateDialect);
        return hibernateProperties;
    }

    @Bean(name = "tertiaryTransactionManager")
    PlatformTransactionManager tertiaryTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(tertiaryEntityManagerFactory(builder).getObject());
    }
    private void dataSourceInfo() {
        DruidDataSource tertiaryDataSource = (DruidDataSource) this.tertiaryDataSource;
        String name = tertiaryDataSource.getName();
        int initialSize = tertiaryDataSource.getInitialSize();
        int maxActive = tertiaryDataSource.getMaxActive();
        int minIdle = tertiaryDataSource.getMinIdle();
        long maxWait = tertiaryDataSource.getMaxWait();
        logger.info("连接池名称：[{}]", name);
        logger.info("初始连接池数：[{}]", initialSize);
        logger.info("最大连接池数：[{}]", maxActive);
        logger.info("最小连接池数：[{}]", minIdle);
        logger.info("获取连接等待超时的时间：[{}]", maxWait);
    }

}