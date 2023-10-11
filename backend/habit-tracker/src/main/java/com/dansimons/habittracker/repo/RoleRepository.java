package com.dansimons.habittracker.repo;

import com.dansimons.habittracker.entity.ERole;
import com.dansimons.habittracker.entity.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
    Role findByName(ERole name);
}
