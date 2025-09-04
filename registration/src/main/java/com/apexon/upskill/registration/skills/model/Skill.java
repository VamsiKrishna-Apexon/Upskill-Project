package com.apexon.upskill.registration.skills.model;
import jakarta.persistence.*;

@Entity
public class Skill {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String skillname;

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



    public Skill(Long id, String skillname, int yearsOfExperience, Long userId, String proficiency) {
        this.id = id;
        this.skillname = skillname;

    }
    public Skill(){

    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", name='" + skillname + '\'' +
                '}';
    }
}

