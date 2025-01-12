package com.fintrack.FinTrack.controller;

import org.springframework.web.bind.annotation.RestController;
import com.fintrack.FinTrack.entity.Users;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

@RestController
public interface UserController {
	
	ResponseEntity<List<Users>> getAll();
	
	ResponseEntity<Users> getUserByUid(String uid);
	
	ResponseEntity<Users> postUser(Users user);
	
	ResponseEntity<Object> loginUser(Users user);
	
	ResponseEntity<Object> patchUser(Map<String, Object> request);
	
}
