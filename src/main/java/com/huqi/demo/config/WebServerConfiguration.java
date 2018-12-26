package com.huqi.demo.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

/**
 * @author: huqi
 * @DATE: 2018/12/21
 * @TIME: 7:41 PM
 **/
@Component
@EnableOAuth2Sso
public class WebServerConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
//        http.requestMatchers().antMatchers("/index").and().authorizeRequests().anyRequest().permitAll()
//                .and().
//                antMatcher("/user/**")
//                .authorizeRequests().anyRequest().authenticated();
        http.antMatcher("/user/**").authorizeRequests().anyRequest().authenticated();
    }
}
