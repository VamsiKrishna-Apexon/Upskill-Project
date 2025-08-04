package com.apexon.upskill.registration.skills.service;

import com.apexon.upskill.registration.user.entity.User;
import com.apexon.upskill.registration.user.enums.UserRole;
import com.apexon.upskill.registration.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) throws Exception {
        if(userRepository.findByUserName(user.getUserName()) != null)
            throw new Exception("User already Exists");

        if(user.getRole() == null)
            user.setRole(UserRole.LEARNER);

        return userRepository.save(user);

    }
}
