package com.apexon.upskill.registration.user.controller;
import com.apexon.upskill.registration.user.service.UserService;
import com.apexon.upskill.registration.user.model.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<?> createUser(@Valid @RequestBody User user){
        try{
            User createdUser = userService.createUser(user);
            return ResponseEntity.ok(createdUser);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/updateUser/{id}")
    public ResponseEntity<?> updateSkillProficiency(@Valid @RequestBody User user, @PathVariable Long id){
        try{
            User createdUser = userService.updateUser(user, id);
            return ResponseEntity.ok(createdUser);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
