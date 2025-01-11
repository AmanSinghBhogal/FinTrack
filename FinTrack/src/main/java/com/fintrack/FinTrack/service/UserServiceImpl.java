package com.fintrack.FinTrack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.fintrack.FinTrack.entity.Users;
import com.fintrack.FinTrack.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	JWTService jwtService;
	
	@Autowired
	AuthenticationManager authManager;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

	@Override
	public List<Users> findAllUsers() {

		Iterable<Users> allUsers = userRepository.findAll();
		if(allUsers != null)
			return (List<Users>) allUsers;
		else
			throw new RuntimeException("Users not found.");
	}

	@Override
	public Users findUserByUid(String uid) {
		
		Users thisUser;
		Optional<Users> user= userRepository.findById(uid);
		thisUser =  user.get();
		return thisUser;
	}

	@Override
	public Users postUser(Users user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return userRepository.save(user);
		
	}

	@Override
	public String verify(Users user) {
		System.out.println("Login Called");
		Authentication  authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword()));
		if(authentication.isAuthenticated()) {
			return jwtService.generateToken(user.getEmail());
		}
		return "Failure";
	}
	
	
	
}
