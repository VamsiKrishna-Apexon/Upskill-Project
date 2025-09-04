package com.apexon.upskill.registration.skills.service;

import com.apexon.upskill.registration.skills.dto.SkillDTO;
import com.apexon.upskill.registration.skills.model.Skill;
import com.apexon.upskill.registration.skills.response.ServiceResponse;
import com.apexon.upskill.registration.skills.serviceImpl.SkillServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    @Autowired
    SkillServiceImpl impl;

    public ServiceResponse addSkill(List<Skill> skills){
        return impl.addSkills(skills);
    }
    public List<SkillDTO> getSkills(){
        return impl.getAllSkills();
    }

    public ServiceResponse deleteSkill(String skill){
        return impl.deleteSkillByName(skill);
    }

}
