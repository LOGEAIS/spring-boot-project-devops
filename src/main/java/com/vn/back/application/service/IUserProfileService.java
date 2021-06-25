package com.vn.back.application.service;

import com.vn.back.application.model.UserPreferences;
import com.vn.back.application.model.UserProgression;

public interface IUserProfileService {

    UserProgression getUserProgression(String username);

    void updateUserPreferences(String username, UserPreferences preferences);

    void updateUserProgression(String username, UserProgression progression);

    UserPreferences getUserPreferences(String username);
}
