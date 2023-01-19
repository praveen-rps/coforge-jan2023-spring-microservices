package com.example.demo;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
  
@EnableWebSecurity
@Configuration
public class Config extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
  
    // Adding the roles
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
         	
    	 auth.jdbcAuthentication().passwordEncoder(getPasswordEncoder())
         .dataSource(dataSource)
         .usersByUsernameQuery("select username, password, enabled from users where username=?")
         .authoritiesByUsernameQuery("select username, role from users where username=?");
         
    }
  
    // Configuring the api
    // according to the roles.
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/testadmin").hasRole("ADMIN")
                .antMatchers("/delete").hasRole("ADMIN")
                .antMatchers("/testuser").hasAnyRole("ADMIN","USER")
                .and()
                .formLogin();
    }
  
    // Function to encode the password
    // assign to the particular roles.
    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}