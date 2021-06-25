package com.vn.back.application.service;

import com.vn.back.application.model.UserPreferences;
import com.vn.back.application.model.UserProfile;
import com.vn.back.application.model.UserProgression;
import com.vn.back.application.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService implements IUserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Override
    public UserProgression getUserProgression(String username) {
        return userProfileRepository.findByUsername(username).getProgression();
    }

    @Override
    public UserPreferences getUserPreferences(String username) {
        return userProfileRepository.findByUsername(username).getPreferences();
    }

    @Override
    public void updateUserPreferences(String username, UserPreferences preferences) {
        UserProfile userToUpdate = userProfileRepository.findByUsername(username);
        preferences.setUserProfile_username(username);
        userToUpdate.setPreferences(preferences);
        userProfileRepository.save(userToUpdate);
    }

    @Override
    public void updateUserProgression(String username, UserProgression progression) {
        UserProfile userToUpdate = userProfileRepository.findByUsername(username);
        progression.setUserProfile_username(username);
        userToUpdate.setProgression(progression);
        userProfileRepository.save(userToUpdate);
    }

}
