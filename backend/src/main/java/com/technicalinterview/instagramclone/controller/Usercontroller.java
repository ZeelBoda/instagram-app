package com.technicalinterview.instagramclone.controller;
import com.technicalinterview.instagramclone.Entity.Users;
import com.technicalinterview.instagramclone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class Usercontroller {

    @Autowired
    UserService userService;

    @PostMapping("")
    private Users submitUser(@RequestBody Users users) {
       return userService.submitMetaDataOfUser(users);

    }
    @GetMapping("/{userid}")
    private Users getUserDetails(@PathVariable("userid") String userId)
    {
        return userService.displayUserMetaData(userId);

    }
}
