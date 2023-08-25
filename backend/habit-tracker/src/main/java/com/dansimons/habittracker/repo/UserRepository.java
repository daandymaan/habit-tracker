package com.dansimons.habittracker.repo;

import com.dansimons.habittracker.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
