// This is layer 4: Service Layer
package com.fintrack.FinTrack.service;

import org.springframework.stereotype.Service;
import com.fintrack.FinTrack.entity.User;
import java.util.List;

@Service
public interface UserService {
	
	List<User> findAllUsers();
//	User findUserByUid(String uid);

}
