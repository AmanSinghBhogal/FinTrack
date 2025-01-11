package com.fintrack.FinTrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fintrack.FinTrack.entity.Users;

import com.fintrack.FinTrack.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/users")
public class UserControllerImpl implements UserController {
	@Autowired
	UserService userService;
	
	@Override
	@GetMapping
	public ResponseEntity<List<Users>> getAll(){
		System.out.println("/users enpoint called");
		List<Users> allUsers = userService.findAllUsers();
		return new ResponseEntity<>(allUsers,HttpStatus.OK);
	}

	@Override
	@GetMapping("/{uid}")
	public ResponseEntity<Users> getUserByUid(@PathVariable("uid") String uid) {
		Users user = userService.findUserByUid(uid);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
	
//	@GetMapping("/csrf-token")
//	public CsrfToken getCsrfToken(HttpServletRequest request) {
//		return (CsrfToken) request.getAttribute("_csrf");
//	}

	@PostMapping("/register")
	@Override
	public ResponseEntity<Users> postUser(@RequestBody Users user) {
		Users resp = userService.postUser(user);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@PostMapping("/login")
	@Override
	public ResponseEntity<Object> loginUser(@RequestBody Users user) {
		System.out.println("User is "+ user.getEmail() + " pass: "+ user.getPassword());
		// TODO Auto-generated method stub
		return new ResponseEntity<>(userService.verify(user), HttpStatus.OK);
	}	
	
}
