package com.apexon.upskill.registration.user.service;

import com.apexon.upskill.registration.user.model.User;
import com.apexon.upskill.registration.enums.UserRole;
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

    public User updateUser(User user, Long id) throws Exception {
        if(userRepository.findById(id).isEmpty())
            throw new Exception("User does not Exist");
        user.setUserId(id);
        return userRepository.save(user);
    }
}
