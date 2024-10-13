// This is layer 3: Repository layer
package com.fintrack.FinTrack.repository;

import org.springframework.stereotype.Repository;
import com.fintrack.FinTrack.entity.User;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
