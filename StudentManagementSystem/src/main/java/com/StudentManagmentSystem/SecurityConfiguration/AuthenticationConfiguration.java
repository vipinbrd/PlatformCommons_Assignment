package com.StudentManagmentSystem.SecurityConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.StudentManagmentSystem.UserDetailServiceProvider.UserDetailsServiceIMPL;

@Configuration
@EnableWebSecurity
public class AuthenticationConfiguration extends  WebSecurityConfigurerAdapter{
	@Bean
	public UserDetailsService userDetailService() {
		
		return new UserDetailsServiceIMPL();
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		
		DaoAuthenticationProvider daoAuthentication=new DaoAuthenticationProvider();
		daoAuthentication.setUserDetailsService(userDetailService());
		daoAuthentication.setPasswordEncoder(passwordEncoder());
		return daoAuthentication;
		
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(daoAuthenticationProvider());
		super.configure(auth);
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN")
		.antMatchers("/student/**").hasRole("STUDENT")
		
		
		.antMatchers("/**").permitAll().and().formLogin();

			http.cors().disable();
			http.csrf().disable();
			super.configure(http);
	}

}
