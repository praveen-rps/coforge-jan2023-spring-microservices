package com.example.security.inmemory;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
  
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)  
public class Config extends WebSecurityConfigurerAdapter {
  
    // Adding the roles
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
         	
    	auth.inMemoryAuthentication()
                .withUser("praveen")
                .password("kumar")
                .roles("admin")
                .and()
                .withUser("satish")
                .password("12345")
                .roles("customer");
    }
  
    // Configuring the api
    // according to the roles.
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/testadmin").hasRole("admin")
                .antMatchers("/delete").hasRole("admin")
                .antMatchers("/testuser").hasAnyRole("user")
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