package com.apexon.upskill.registration.skills.dto;

import lombok.Data;

@Data
public class SkillDTO {

    private String skillName;
    private int yearsOfExperience;
    private String proficiency;

    public SkillDTO(String skillName, int yearsOfExperience, String proficiency) {
        this.skillName = skillName;
        this.yearsOfExperience = yearsOfExperience;
        this.proficiency = proficiency;
    }

    public SkillDTO(){
    }

}
