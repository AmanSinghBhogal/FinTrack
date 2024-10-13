package com.fintrack.FinTrack.controller;

import org.springframework.web.bind.annotation.RestController;
import com.fintrack.FinTrack.entity.User;
import java.util.List;
import org.springframework.http.ResponseEntity;

@RestController
public interface UserController {
	
	ResponseEntity<List<User>> getAll();
	
}
