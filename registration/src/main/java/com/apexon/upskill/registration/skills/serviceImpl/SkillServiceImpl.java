package com.apexon.upskill.registration.skills.serviceImpl;

import com.apexon.upskill.registration.skills.dto.SkillDTO;
import com.apexon.upskill.registration.skills.model.Skill;
import com.apexon.upskill.registration.skills.repository.SkillRepository;
import com.apexon.upskill.registration.skills.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class SkillServiceImpl {


    @Autowired
    SkillRepository repository;
    List<Skill> skills;
    public ServiceResponse updateSkills(Long userId, List<Skill> newSkills) {
        if (newSkills == null || newSkills.isEmpty()) {
            return new ServiceResponse(false, "No skills provided");
        }

        for (Skill s : newSkills) {
            s.setUserId(userId);
            System.out.println("Skill Name:"+s.getSkillname());
        }

        List<Skill> saved = repository.saveAll(newSkills);
        // saveAll calls save() for each item under the hood :contentReference[oaicite:1]{index=1}

        return new ServiceResponse(true,
                String.format("%d skills successfully updated", saved.size()));
    }

    public List<SkillDTO> getSkillsByUserId(Long userId) {
        List<Skill> skills = repository.findByUserId(userId);
        return skills.stream()
                .map(skill -> new SkillDTO(skill.getSkillname(), skill.getYearsOfExperience(), skill.getProficiency()))
                .collect(Collectors.toList());
    }

    }

