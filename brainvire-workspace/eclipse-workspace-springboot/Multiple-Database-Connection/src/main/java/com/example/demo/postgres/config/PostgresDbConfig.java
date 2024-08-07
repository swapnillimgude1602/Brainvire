package com.example.demo.postgres.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "ManagerFactoryBean", basePackages = {
		"com.example.demo.postgres.repositories" }, transactionManagerRef = "transactionManager")
public class PostgresDbConfig {

	@Autowired
	private Environment environment;

	// datasource
	@Bean("seconddatasource")
	@Primary
	public DataSource datasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl(environment.getProperty("second.datasource.url"));
		datasource.setDriverClassName(environment.getProperty("second.datasource.driver-class-name"));
		datasource.setUsername(environment.getProperty("second.datasource.username"));
		datasource.setPassword(environment.getProperty("second.datasource.password"));
		return datasource;

	}

	// entityManagerFactory
	@Bean(name = "ManagerFactoryBean")
	@Primary
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {

		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setDataSource(datasource());
		JpaVendorAdapter adaptor = new HibernateJpaVendorAdapter();
		bean.setJpaVendorAdapter(adaptor);
		Map<String, String> props = new HashMap<>();
		props.put("hibernate.dialect", environment.getProperty("hibernate.dialect"));
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.hbm2ddl.auto", "update");
		bean.setJpaPropertyMap(props);
		bean.setPackagesToScan("com.example.demo.postgres.entities");
		return bean;
	}

	// platform transaction manager

	@Bean(name = "transactionManager")
	@Primary
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager manager = new JpaTransactionManager();
		manager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
		return manager;
	}
}
