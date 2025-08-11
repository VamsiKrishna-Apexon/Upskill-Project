package com.apexon.upskill.registration.userskill.controller;

import com.apexon.upskill.registration.user.model.User;
import com.apexon.upskill.registration.userskill.dto.UserSkillDTO;
import com.apexon.upskill.registration.userskill.model.UserSkill;
import com.apexon.upskill.registration.userskill.service.UserSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserSkillController {
    @Autowired
    private UserSkillService userSkillService;

    @PutMapping("/{userId}/skill/{skillId}/{proficiency}")
    public ResponseEntity<?> updateProficiency(@PathVariable Long userId, @PathVariable Long skillId, @PathVariable int proficiency){
        try {
            UserSkillDTO userSkillDTO = userSkillService.updateProficiency(userId, skillId, proficiency);
            return ResponseEntity.ok(userSkillDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
