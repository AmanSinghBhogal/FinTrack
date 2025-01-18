package com.fintrack.FinTrack.service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

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

	@Override
	public Users patchUser(Map<String, Object> fields) {
		String uidToSearch = (String) fields.get("uid");
		System.out.println("UID to patch: "+ uidToSearch);
		if(userRepository.existsById(uidToSearch)) {
			System.out.println("Inside if for patch users....");
			Users existingUser = userRepository.findById(uidToSearch).get();
			 fields.forEach((key, value) -> {
	                Field field = ReflectionUtils.findField(Users.class, key);
	                field.setAccessible(true);
	                // Handle gender field explicitly
	                if ("gender".equals(key) && value instanceof String) {
	                    String genderValue = (String) value;
	                    if (genderValue.length() == 1) {
	                        ReflectionUtils.setField(field, existingUser, genderValue.charAt(0));
	                    } else {
	                        throw new IllegalArgumentException("Invalid value for gender: " + value);
	                    }
	                } else {
	                    ReflectionUtils.setField(field, existingUser, value);
	                }
	            });
			 return userRepository.save(existingUser);
		}
		return null;
	}
	
	
	
}
