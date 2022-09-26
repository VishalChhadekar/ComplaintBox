package com.abc_telecom_Ltd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class WebSecutiryConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().disable()
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/**").permitAll()//permitted all for demo only
		.anyRequest()
        .authenticated();
	}

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		
//	}
	

}
