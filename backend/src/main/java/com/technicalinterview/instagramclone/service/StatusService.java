package com.technicalinterview.instagramclone.service;

import com.technicalinterview.instagramclone.Entity.Status;
import com.technicalinterview.instagramclone.Entity.Users;
import com.technicalinterview.instagramclone.repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StatusService {
    @Autowired
    StatusRepo statusRepo;

    @Autowired
    UserService userService;

    public Status submitDataIntoDB(Status status) {
        return statusRepo.save(status);
    }

    public ArrayList<Status> retrieveStatus(){

        ArrayList<Status> statusList=statusRepo.findAll();

        for(int i=0;i<statusList.size();i++) {
            Status statusItem=statusList.get(i);
            Users user = userService.displayUserMetaData(statusItem.getUserId());
            if (user != null) {
                String username = user.getUsername();
                if (username != null) {
                    statusItem.setUserName(username);
                } else {
                    // Handle the case where username is null
                    statusItem.setUserName("Unknown User");
                }
            } else {
                // Handle the case where user is null
                statusItem.setUserName("Unknown User");
            }
        }

        return statusList;
    }
}
