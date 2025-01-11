package com.fintrack.FinTrack.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fintrack.FinTrack.filter.JwtFilter;

// This is the configuration file to modify spring security
@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	JwtFilter jwtFilter;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		
		/*
		 * Old Syntax for: http.csrf(customizer -> customizer.disable());
		 * 
		 	Customizer<CsrfConfigurer<HttpSecurity>> custCsrf = new Customizer<CsrfConfigurer<HttpSecurity>>() {
				
				@Override
				public void customize(CsrfConfigurer<HttpSecurity> customizer) {
					customizer.disable();			
				}
			};
		 *  
		 */
		
		//disabling csrf using Lamba syntax
		http.csrf(customizer -> customizer.disable());
		http.authorizeHttpRequests(request -> request
													.requestMatchers("users/register","users/login")
													.permitAll()
													.anyRequest().authenticated());
		http.formLogin(Customizer.withDefaults());
		//For Rest Access
		http.httpBasic(Customizer.withDefaults());
		//Making http stateless
		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
		
		return http.build();
	}
	
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
		provider.setUserDetailsService(userDetailsService);
		return provider;
		
	}
	
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}
	
//  @Bean
//  public UserDetailsService userDetailsService() {
//
//      UserDetails user1 = User
//              .withDefaultPasswordEncoder()
//              .username("kiran")
//              .password("k@123")
//              .roles("USER")
//              .build();
//
//      UserDetails user2 = User
//              .withDefaultPasswordEncoder()
//              .username("harsh")
//              .password("h@123")
//              .roles("ADMIN")
//              .build();
//      return new InMemoryUserDetailsManager(user1, user2);
//  }
	
}
