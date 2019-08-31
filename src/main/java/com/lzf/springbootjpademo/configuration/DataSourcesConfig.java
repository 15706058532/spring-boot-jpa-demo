package com.lzf.springbootjpademo.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据源配置
 * <br/>
 * Created in 2019-08-27 23:11:54
 * <br/>
 *
 * @author Zhenfeng Li
 */
@Configuration
public class DataSourcesConfig {

    @Bean(name = "primaryDataSource")
    @Qualifier("primaryDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public DataSource primaryDataSource() {
        return new HikariDataSource();
    }

    @Bean(name = "secondaryDataSource")
    @Qualifier("secondaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.secondary")
    public DataSource secondaryDataSource() {
        return new HikariDataSource();
    }

    @Bean(name = "tertiaryDataSource")
    @Qualifier("tertiaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.tertiary")
    public DataSource tertiaryDataSource() {
        return new DruidDataSource();
    }


    /**
     * druid监控配置
     */
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean<WebStatFilter> beanFilter = new FilterRegistrationBean<>();
        beanFilter.setFilter(new WebStatFilter());
        Map<String, String> initParams = new HashMap<>();
        initParams.put("exclusions", "*.js,*.css,/druid/*");
        beanFilter.setInitParameters(initParams);
        beanFilter.setUrlPatterns(Collections.singletonList("/*"));
        return beanFilter;
    }

    /**
     * druid监控配置
     */
    @Bean
    public ServletRegistrationBean setStatViewServlet() {
        ServletRegistrationBean<StatViewServlet> beanServlet = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        Map<String, String> initParams = new HashMap<>();
        initParams.put("loginUsername", "cleancode");
        initParams.put("loginPassword", "cleancode");
        //默认允许任何访问但需提供账户和密码
        initParams.put("allow", "");
        beanServlet.setInitParameters(initParams);
        return beanServlet;
    }
}
