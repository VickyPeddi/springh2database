package com.example.springbooth2database.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().antMatchers("/mango/admin").authenticated().
                antMatchers("/mango/user").authenticated().
                antMatchers("/mango/").permitAll().and().formLogin().and().
                httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("nanda").password("nanda").authorities("User")
                .and().withUser("pavan").password("pavan").authorities("Admin").and().
                passwordEncoder(NoOpPasswordEncoder.getInstance());
    }
}
