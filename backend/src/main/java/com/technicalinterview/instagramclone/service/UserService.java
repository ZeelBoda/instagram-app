package com.technicalinterview.instagramclone.service;

import com.technicalinterview.instagramclone.Entity.Users;
import com.technicalinterview.instagramclone.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    UserRepo userRepo;
    public Users submitMetaDataOfUser(Users users)
     {
         return userRepo.save(users);
     }
    public Users displayUserMetaData(String userId) {
        Users user = userRepo.findByUserId(userId);
        if (user == null) {
            // If user data is not found, return a default or empty Users object
            user = new Users();
            // Set the userId to the provided userId
            user.setUserId(userId);
            // You can also set other properties as per your requirement
            // user.setUsername("Default Username");
            // user.setName("Default Name");
            // user.setProfileImage("Default Profile Image");
        }
        return user;
    }

}
