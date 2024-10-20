// This is layer 3: Repository layer
package com.fintrack.FinTrack.repository;

import org.springframework.stereotype.Repository;
import com.fintrack.FinTrack.entity.Users;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<Users, String> {

}
