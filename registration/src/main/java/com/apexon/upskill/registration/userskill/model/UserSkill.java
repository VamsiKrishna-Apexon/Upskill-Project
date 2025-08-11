package com.apexon.upskill.registration.userskill.model;

import com.apexon.upskill.registration.skills.model.Skill;
import com.apexon.upskill.registration.user.model.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserSkill {
    @EmbeddedId
    private UserSkillKey id = new UserSkillKey();

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

//    public UserSkill(User user, Skill skill) {
//        this.user = user;
//        this.skill = skill;
//    }
//
//    public UserSkill() {
//    }

    @ManyToOne
    @MapsId("skillId")
    @JoinColumn(name = "skill_id")
    @JsonBackReference
    private Skill skill;

    private int proficiency;
}
