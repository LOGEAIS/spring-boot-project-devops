package com.vn.back.application.service;

import com.vn.back.application.model.UserProfile;
import com.vn.back.application.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public boolean register(UserProfile userProfile) {
        UserProfile userInDatabase = userProfileRepository.findByUsername(userProfile.getUsername());
        if (userInDatabase != null) {
            return false;
        }
        String nonEncodedPassword = userProfile.getPassword();
        userProfile.setPassword(passwordEncoder.encode(nonEncodedPassword));
        userProfile.getPreferences().setUserProfile(userProfile);
        userProfile.getProgression().setUserProfile(userProfile);
        userProfileRepository.save(userProfile);
        return true;
    }

    @Override
    public boolean authenticate(UserProfile userProfile) {
        String username = userProfile.getUsername();
        String nonEncodedPassword = userProfile.getPassword();
        UserProfile userInDatabase = userProfileRepository.findByUsername(username);
        if (userInDatabase == null) {
            return false;
        }
        String encodedPassword = userInDatabase.getPassword();
        return passwordEncoder.matches(nonEncodedPassword, encodedPassword);
    }
}
