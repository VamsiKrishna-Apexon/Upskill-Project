package com.apexon.upskill.registration.userskill.dto;

import lombok.Data;

@Data
public class UserSkillDTO {
    private long userId;
    private long skillId;
    private int proficiency;

    public UserSkillDTO(long userId, long skillId, int proficiency) {
        this.userId = userId;
        this.skillId = skillId;
        this.proficiency = proficiency;
    }

    public UserSkillDTO() {
    }
}
