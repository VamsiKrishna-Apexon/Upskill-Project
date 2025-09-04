package com.apexon.upskill.registration.skills.controller;

import com.apexon.upskill.registration.skills.dto.SkillDTO;
import com.apexon.upskill.registration.skills.model.Skill;
import com.apexon.upskill.registration.skills.response.ServiceResponse;
import com.apexon.upskill.registration.skills.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {
//    @Autowired
//    Skill skills;

    @Autowired
    SkillService service;
    @PutMapping
    public ResponseEntity<ServiceResponse> addSkills(@RequestBody List<Skill> skills) {
        ServiceResponse response = service.addSkill(skills);
        if (response.isSuccess()) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping
    public ResponseEntity<List<SkillDTO>> getAllSkills() {
        List<SkillDTO> skills = service.getSkills();
        if (skills.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(skills);
    }

    @DeleteMapping("/deleteSkill/{skillname}")
    public ResponseEntity<ServiceResponse> deleteSkillByName(@PathVariable String skillname) {
        ServiceResponse response = service.deleteSkill(skillname);
        if (response.isSuccess()) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.badRequest().body(response);
        }
    }

}
