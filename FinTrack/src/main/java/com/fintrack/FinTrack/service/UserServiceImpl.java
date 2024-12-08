package com.fintrack.FinTrack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fintrack.FinTrack.entity.Users;
import com.fintrack.FinTrack.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

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
	
}
