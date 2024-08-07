package com.example.demo.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.	security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.demo.Service.CustomerDetailService;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class MySecurityConfiguration {

	// Authentication
	@Bean
	public UserDetailsService userDetailsService() {
//		UserDetails admin = User.withUsername("Swapnil").password(encoder.encode("swap@123")).roles("ADMIN").build();
//
//		UserDetails user = User.withUsername("Deva").password(encoder.encode("deva@123")).roles("NORMAL").build();
//		return new InMemoryUserDetailsManager(admin, user);
		
		return new CustomerDetailService();
	}

	// Authorization
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return 
				http.csrf().disable()
				.authorizeHttpRequests()
				.requestMatchers("/customer/show//show/{customerid}").permitAll()
				.and()
				.authorizeHttpRequests()
				.requestMatchers("/customer/*").authenticated()
				.and()
				.formLogin()
				.and()
				.build();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(userDetailsService());
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		return daoAuthenticationProvider;
	}

	
}
