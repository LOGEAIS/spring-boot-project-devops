package com.vn.back.application.service;

import com.vn.back.application.model.UserProfile;

public interface ILoginService {

    boolean register(UserProfile userProfile);

    boolean authenticate(UserProfile userProfile);
}
