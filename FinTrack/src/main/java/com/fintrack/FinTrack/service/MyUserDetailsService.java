package com.fintrack.FinTrack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fintrack.FinTrack.entity.UserPrincipal;
import com.fintrack.FinTrack.entity.Users;
import com.fintrack.FinTrack.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Users user = findByEmailId(email);
		
		if (user == null) {
			System.out.println("User Not Found");
			throw new UsernameNotFoundException("Email Not found");
		}
		return new UserPrincipal(user);
	}
	
	public Users findByEmailId(String email) {
		Users resp = new Users();
		Iterable<Users> users = userRepository.findAll();
		boolean flag  = false;
		System.out.println("Param email is: "+ email);
		
		for(Users u: users) {
			if(u.getEmail().equals(email)) {
				resp = u;
				flag = true;
			}
		}
		
		if(flag) {
			return resp;
		}
		else {
			System.out.println("No User found with email: "+email);
			return resp;
		}
	}
}
