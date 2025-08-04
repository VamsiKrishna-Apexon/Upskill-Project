package com.apexon.upskill.registration.user.controller;
import com.apexon.upskill.registration.skills.service.UserService;
import com.apexon.upskill.registration.user.entity.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user/createUser")
    public ResponseEntity<?> createUser(@Valid @RequestBody User user){
        try{
            User createdUser = userService.createUser(user);
            return ResponseEntity.ok(createdUser);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }


    }
}
