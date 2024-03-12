package com.technicalinterview.instagramclone.controller;
import com.technicalinterview.instagramclone.Entity.Users;
import com.technicalinterview.instagramclone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class Usercontroller {

    @Autowired
    UserService userService;
    @PostMapping("")
    private boolean submitUser(@RequestBody Users users) {
        userService.submitMetaDataOfUser(users);
        return true;
    }
    @GetMapping("/{userid}")
    private Users getUserDetails(@PathVariable("userid") String userId)
    {
        return new Users();
    }
}
