package com.apexon.upskill.registration.userskill.repository;

import com.apexon.upskill.registration.userskill.model.UserSkill;
import com.apexon.upskill.registration.userskill.model.UserSkillKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSkillRepository extends JpaRepository<UserSkill, UserSkillKey> {
}
