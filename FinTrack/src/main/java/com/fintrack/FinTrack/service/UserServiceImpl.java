package com.fintrack.FinTrack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fintrack.FinTrack.entity.User;
import com.fintrack.FinTrack.repository.UserRepository;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAllUsers() {

		Iterable<User> allUsers = userRepository.findAll();
		if(allUsers != null)
			return (List<User>) allUsers;
		else
			throw new RuntimeException("Users not found.");
	}

//	@Override
//	public User findUserByUid(String uid) {
//		
//		User thisUser;
//		Optional<User> user=null;
//		user = userRepository.findById(uid);
//		return null;
//	}
	
}
