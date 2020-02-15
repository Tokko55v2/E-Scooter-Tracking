package com.escooter.michael.kroneder.security;


import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain (ServerHttpSecurity httpSecurity){
         httpSecurity.csrf().disable()
                .authorizeExchange()
                 .pathMatchers(HttpMethod.GET,"api/flash/**").hasAnyRole("ADMIN","USER")
                .pathMatchers(HttpMethod.POST,"/api/flash/update").hasAnyRole("ADMIN")
                .pathMatchers("/**").permitAll()
                .and()
                .httpBasic();

         return httpSecurity.build();
    }

    @Bean
    public MapReactiveUserDetailsService userDetailsService(){
        UserDetails userDetails = User.withUsername("user")
                .password(passwordEncoder().encode("user"))
                .roles("USER")
                .build();

        UserDetails admin = User.withUsername("admin")
                .password(passwordEncoder().encode("admin"))
                .roles("ADMIN")
                .build();

        return new MapReactiveUserDetailsService(userDetails,admin);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
