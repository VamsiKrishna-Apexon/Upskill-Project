package com.apexon.upskill.registration.skills.dto;

public class SkillDTO {

        private Long id;
        private String skillname;

    public Long getId() {
        return id;
    }

    public String getSkillname() {
        return skillname;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public SkillDTO(Long id,String skillname) {
        this.skillname = skillname;
        this.id=id;

    }


    public SkillDTO(){

    }
}
