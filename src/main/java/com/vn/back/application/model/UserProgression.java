package com.vn.back.application.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class UserProgression {

    @Id
    private String userProfile_username;
    @OneToOne
    @MapsId
    @JsonBackReference
    private UserProfile userProfile;
    private String saveDataId;
    private String saveData;

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public String getUserProfile_username() {
        return userProfile_username;
    }

    public void setUserProfile_username(String userProfile_username) {
        this.userProfile_username = userProfile_username;
    }

    public String getSaveDataId() {
        return saveDataId;
    }

    public void setSaveDataId(String saveDataId) {
        this.saveDataId = saveDataId;
    }

    public String getSaveData() {
        return saveData;
    }

    public void setSaveData(String saveData) {
        this.saveData = saveData;
    }
}
