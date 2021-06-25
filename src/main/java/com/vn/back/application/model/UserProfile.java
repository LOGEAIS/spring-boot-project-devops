package com.vn.back.application.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserProfile {

    @Id
    private String username;
    private String password;
    @OneToOne(mappedBy = "userProfile", cascade = CascadeType.ALL)
    @JsonManagedReference
    private UserPreferences preferences;
    @OneToOne(mappedBy = "userProfile", cascade = CascadeType.ALL)
    @JsonManagedReference
    private UserProgression progression;

    public UserProfile() {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserPreferences getPreferences() {
        return preferences;
    }

    public void setPreferences(UserPreferences preferences) {
        this.preferences = preferences;
    }

    public UserProgression getProgression() {
        return progression;
    }

    public void setProgression(UserProgression progression) {
        this.progression = progression;
    }
}
