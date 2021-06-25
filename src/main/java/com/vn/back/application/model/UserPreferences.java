package com.vn.back.application.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class UserPreferences {

    @Id
    private String userProfile_username;
    @OneToOne
    @MapsId
    @JsonBackReference
    private UserProfile userProfile;
    private String language;
    private float musicVolume;
    private float voiceVolume;
    private float soundVolume;
    private float textSpeed;
    private float autoPlaySpeed;

    public UserPreferences() {
    }

    public String getUserProfile_username() {
        return userProfile_username;
    }

    public void setUserProfile_username(String userProfile_username) {
        this.userProfile_username = userProfile_username;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public float getMusicVolume() {
        return musicVolume;
    }

    public void setMusicVolume(float musicVolume) {
        this.musicVolume = musicVolume;
    }

    public float getVoiceVolume() {
        return voiceVolume;
    }

    public void setVoiceVolume(float voiceVolume) {
        this.voiceVolume = voiceVolume;
    }

    public float getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(float soundVolume) {
        this.soundVolume = soundVolume;
    }

    public float getTextSpeed() {
        return textSpeed;
    }

    public void setTextSpeed(float textSpeed) {
        this.textSpeed = textSpeed;
    }

    public float getAutoPlaySpeed() {
        return autoPlaySpeed;
    }

    public void setAutoPlaySpeed(float autoPlaySpeed) {
        this.autoPlaySpeed = autoPlaySpeed;
    }
}
