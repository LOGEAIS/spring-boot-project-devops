package com.vn.back.application.repository;

import com.vn.back.application.model.UserProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends CrudRepository<UserProfile, String> {
    UserProfile findByUsername(String username);
}
