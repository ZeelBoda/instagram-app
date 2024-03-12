package com.technicalinterview.instagramclone.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import javax.validation.constraints.NotNull;


public class Users
{
    @Id
    @GeneratedValue
    private int id;
   // @NotNull
    @NotNull
    private String userId;
    private String username;
    private String name;
    private String profileImage;
    public Users() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Users(int id, @NotNull String userId, String username, String name, String profileImage) {
        super();
        this.id = id;
        this.userId = userId;
        this.username = username;
        this.name = name;
        this.profileImage = profileImage;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProfileImage() {
        return profileImage;
    }
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

}
