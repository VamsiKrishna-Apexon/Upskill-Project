package com.apexon.upskill.registration.skills.serviceImpl;

import com.apexon.upskill.registration.skills.dto.SkillDTO;
import com.apexon.upskill.registration.skills.model.Skill;
import com.apexon.upskill.registration.skills.repository.SkillRepository;
import com.apexon.upskill.registration.skills.response.ServiceResponse;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class SkillServiceImpl {

    @Autowired
    SkillRepository repo;

    public ServiceResponse addSkills(List<Skill> skills) {
        try {
            List<Skill> savedSkills = repo.saveAll(skills);
            if (savedSkills.size() == skills.size()) {
                return new ServiceResponse(true, "Skills added successfully");
            } else {
                return new ServiceResponse(false, "Some skills could not be added");
            }
        } catch (Exception e) {
            return new ServiceResponse(false, "Error adding skills: " + e.getMessage());
        }
    }

    @Transactional
    public ServiceResponse deleteSkillByName(String skillname) {
        try {
            boolean check = repo.existsBySkillname(skillname);


            if (!check) {
                return new ServiceResponse(false, "Skill with name '" + skillname + "' does not exist");
            }else {
                repo.deleteBySkillname(skillname);
                return new ServiceResponse(true, "Skill deleted successfully");
            }
        } catch (Exception e) {
            return new ServiceResponse(false, "Error deleting skill: " + e.getMessage());
        }
    }


    public List<SkillDTO> getAllSkills() {
        List<Skill> skills = repo.findAll();
        return skills.stream()
                .map(skill -> new SkillDTO(skill.getId(), skill.getSkillname()))
                .collect(Collectors.toList());
    }
    }


