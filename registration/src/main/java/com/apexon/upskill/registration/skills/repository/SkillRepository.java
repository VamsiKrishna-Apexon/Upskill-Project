package com.apexon.upskill.registration.skills.repository;

import com.apexon.upskill.registration.skills.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<Skill,Long> {

    // Custom method to delete skill by skillname
    void deleteBySkillname(String skillname);

    // Optional: To check if skill with that name exists
    boolean existsBySkillname(String skillname);
}
