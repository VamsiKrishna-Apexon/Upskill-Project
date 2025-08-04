package com.apexon.upskill.registration.skills.dto;

public class SkillDTO {


        private String skillname;
        private int yearsOfExperience;
        private String proficiency;

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

    public String getProficiency() {
        return proficiency;
    }

    public SkillDTO(String skillname, int yearsOfExperience, String proficiency) {
        this.skillname = skillname;
        this.yearsOfExperience = yearsOfExperience;
        this.proficiency = proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }
    public SkillDTO(){

    }
}
