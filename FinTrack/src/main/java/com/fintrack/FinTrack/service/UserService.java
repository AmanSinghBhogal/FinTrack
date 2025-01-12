// This is layer 4: Service Layer
package com.fintrack.FinTrack.service;

import org.springframework.stereotype.Service;
import com.fintrack.FinTrack.entity.Users;
import java.util.List;
import java.util.Map;

@Service
public interface UserService {
	
	List<Users> findAllUsers();
	
	Users findUserByUid(String uid);
	
	// Creating new user
	Users postUser(Users user);

	String verify(Users user);
	
	// Update User Details using patch request:
	Users patchUser(Map<String, Object> fields);

}
