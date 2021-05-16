//package com.ucb.bo.ToxicChat.bl;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    private final LogoutHandler logoutHandler;
//
//    public SecurityConfig(LogoutHandler logoutHandler) {
//        this.logoutHandler = logoutHandler;
//    }
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests()
////                .mvcMatchers("/").permitAll()
////                .anyRequest().authenticated()
////                .and().oauth2Login();
//        http
//                .oauth2Login()
//                .and().logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .addLogoutHandler(logoutHandler);
//
//    }
//
//}
