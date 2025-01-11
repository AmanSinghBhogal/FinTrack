package com.fintrack.FinTrack.filter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fintrack.FinTrack.service.JWTService;
import com.fintrack.FinTrack.service.MyUserDetailsService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter extends OncePerRequestFilter {

	@Autowired
	JWTService jwtService;
	
	@Autowired
	ApplicationContext context;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		//Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiaG9nYWxhbWFuQGdtYWlsLmNvbSIsImlhdCI6MTczNjU5NjQ0NywiZXhwIjoxNzM2NTk2ODc5fQ.sznRxXpMsZKMusrHDxxnRzl9Hb2D_BxGsoiLCu4VfgQ
		String authHeader = request.getHeader("Authorization");
		String token = null;
		String userEmail = null;
		System.out.println("JWT Validator invoked");
		if(authHeader != null && authHeader.startsWith("Bearer ")) {
			token = authHeader.substring(7);
			System.out.println(token);
			userEmail = jwtService.extractUserEmail(token);
		}
		
		if(userEmail != null && SecurityContextHolder.getContext().getAuthentication() == null ) {
			UserDetails userDetails  = context.getBean(MyUserDetailsService.class).loadUserByUsername(userEmail);
			if(jwtService.validateToken(token, userDetails)) {
				UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
				authToken.setDetails(new WebAuthenticationDetailsSource()
						 .buildDetails(request));
				
				SecurityContextHolder.getContext().setAuthentication(authToken);
			}
		}
		
		filterChain.doFilter(request, response);
	}

}
