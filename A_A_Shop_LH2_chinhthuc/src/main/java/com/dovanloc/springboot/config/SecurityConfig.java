package com.dovanloc.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Bean
	public PasswordEncoder passwordEncoder() {
		return passwordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		super.configure(auth);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		
		http.authorizeRequests()
			.antMatchers("/").permitAll()
		.and()
			.formLogin()
				.loginPage("/login")
				.loginProcessingUrl("j_login_security")
				.defaultSuccessUrl("/")
				.failureUrl("/login?erro")
				.usernameParameter("username")
				.passwordParameter("password")
		.and()
			.logout()
				.logoutSuccessUrl("/")
				.logoutUrl("/logout")
				.permitAll()
		.and()
			.csrf()
				.disable();
		
	}

	
	
}
