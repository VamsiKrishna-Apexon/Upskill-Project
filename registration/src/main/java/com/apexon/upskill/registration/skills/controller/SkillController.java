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

    @Autowired
    SkillService service;

    @PutMapping("/{id}")
    public ResponseEntity<ServiceResponse> updateSkills(@PathVariable Long id, @RequestBody List<Skill> skills) {

        ServiceResponse resp = service.updateSkill(id, skills);
        return resp.isSuccess()
                ? ResponseEntity.ok(resp)
                : ResponseEntity.badRequest().body(resp);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<SkillDTO>> getUserSkills(@PathVariable Long id) {
        List<SkillDTO> skills = service.getSkillsByUserId(id);
        return skills.isEmpty()
                ? ResponseEntity.noContent().build()
                : ResponseEntity.ok(skills);
    }

}
