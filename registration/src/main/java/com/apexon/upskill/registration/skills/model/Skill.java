package com.apexon.upskill.registration.skills.model;
import jakarta.persistence.*;

@Entity
public class Skill {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String skillname;
        private int yearsOfExperience;

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    private String proficiency;
        private Long userId;

        // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkillname() {
        return skillname;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Skill(Long id, String skillname, int yearsOfExperience, Long userId, String proficiency) {
        this.id = id;
        this.skillname = skillname;
        this.yearsOfExperience = yearsOfExperience;
        this.userId = userId;
        this.proficiency=proficiency;
    }
    public Skill(){

    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", name='" + skillname + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", userId=" + userId +
                ", proficiency=" + proficiency +
                '}';
    }
}

