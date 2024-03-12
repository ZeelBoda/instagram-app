package com.technicalinterview.instagramclone.service;

import com.technicalinterview.instagramclone.Entity.Users;
import org.springframework.stereotype.Service;

@Service
public class UserService
{

    private Users submitMetaDataOfUser(Users users)
     {
         return new Users();
     }
     private Users displayUserMetaData(String userid)
     {
         return new Users();
     }
}
