package com.springcore.jdbc_noXML;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.springcore.StudentDao"})
public class Jdbc_config_autowired {
	
		@Bean("ds")
		public DataSource getDataSource() {
			
			DriverManagerDataSource ds = new DriverManagerDataSource();
			ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			ds.setUrl("jdbc:mysql://localhost:3306/springjdbc?useSSL=false");
			ds.setUsername("root");
			ds.setPassword("root");
			return ds;
			
		}
		
		@Bean("jdbcTemplate")
		public JdbcTemplate getTemplate() {
			JdbcTemplate jdbcTemplate = new JdbcTemplate();
			jdbcTemplate.setDataSource(getDataSource());
			return jdbcTemplate;
			
		}
		
//		@Bean("studentDao")
//		public StudentDao getStudentDao() {
//			StudentDaoImple studentDao = new StudentDaoImple();
//			studentDao.setJdbcTemplate(getTemplate());
//			return studentDao;
//		}

}
