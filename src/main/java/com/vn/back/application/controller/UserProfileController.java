package com.vn.back.application.controller;

import com.vn.back.application.model.UserPreferences;
import com.vn.back.application.model.UserProgression;
import com.vn.back.application.service.IUserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserProfileController {

    @Autowired
    IUserProfileService userProfileService;

    @GetMapping("/getUserProgression")
    public UserProgression getUserProgression(@RequestParam String username) {
        return userProfileService.getUserProgression(username);
    }

    @GetMapping("/getUserPreferences")
    public UserPreferences getUserPreferences(@RequestParam String username) {
        return userProfileService.getUserPreferences(username);
    }

    @PutMapping("/updateUserPreferences/{username}")
    public boolean updateUserPreferences(@RequestBody UserPreferences preferences, @PathVariable String username) {
        userProfileService.updateUserPreferences(username, preferences);
        return true;
    }

    @PutMapping("/updateUserProgression/{username}")
    public boolean updateUserProgression(@RequestBody UserProgression progression, @PathVariable String username) {
        userProfileService.updateUserProgression(username, progression);
        return true;
    }

}
