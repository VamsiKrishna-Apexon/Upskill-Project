package com.apexon.upskill.registration.skills.model;
import com.apexon.upskill.registration.user.model.User;
import com.apexon.upskill.registration.userskill.model.UserSkill;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skillname;
    private int yearsOfExperience;
    private String proficiency;
    private Long userId;

//    @ManyToMany(mappedBy = "skills")
//    private Set<User> users = new HashSet<>();

    @JsonManagedReference
    @OneToMany(mappedBy = "skill")
    private Set<UserSkill> userSkills = new HashSet<>();

//    public Skill(Long id, String skillname, int yearsOfExperience, Long userId, String proficiency) {
//        this.id = id;
//        this.skillname = skillname;
//        this.yearsOfExperience = yearsOfExperience;
//        this.userId = userId;
//        this.proficiency=proficiency;
//    }
//    public Skill(){
//
//    }
//
//    @Override
//    public String toString() {
//        return "Skill{" +
//                "id=" + id +
//                ", name='" + skillname + '\'' +
//                ", yearsOfExperience=" + yearsOfExperience +
//                ", userId=" + userId +
//                ", proficiency=" + proficiency +
//                '}';
//    }
}

