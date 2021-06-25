package com.vn.back.application.controller;

import com.vn.back.application.model.UserProfile;
import com.vn.back.application.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class LoginController {

    @Autowired
    ILoginService loginService;

    @PostMapping("/authenticate")
    public boolean authenticate(@RequestBody UserProfile userProfile) {
        return loginService.authenticate(userProfile);
    }

    @PostMapping("/register")
    public boolean register(@RequestBody UserProfile userProfile) {
        return loginService.register(userProfile);
    }

}
