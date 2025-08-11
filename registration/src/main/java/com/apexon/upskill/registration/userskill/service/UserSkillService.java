package com.apexon.upskill.registration.userskill.service;

import com.apexon.upskill.registration.skills.model.Skill;
import com.apexon.upskill.registration.user.model.User;
import com.apexon.upskill.registration.userskill.dto.UserSkillDTO;
import com.apexon.upskill.registration.userskill.model.UserSkill;
import com.apexon.upskill.registration.userskill.model.UserSkillKey;
import com.apexon.upskill.registration.userskill.repository.UserSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSkillService {

    @Autowired
    private UserSkillRepository userSkillRepository;

    public UserSkillDTO updateProficiency(Long userId, Long skillId, int proficiencyLevel) {
        UserSkillKey userSkillKey = new UserSkillKey(userId, skillId);
        UserSkill userSkill = userSkillRepository.findById(userSkillKey)
                .orElseThrow(() -> new RuntimeException("UserSkill not found"));

        userSkill.setProficiency(proficiencyLevel);
        userSkillRepository.save(userSkill);
        return new UserSkillDTO(userId, skillId, proficiencyLevel);
    }
}
