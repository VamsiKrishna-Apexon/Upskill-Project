package com.apexon.upskill.registration.userskill.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserSkillKey implements Serializable {
    private Long userId;
    private Long skillId;

    public UserSkillKey(Long userId, Long skillId) {
        this.userId = userId;
        this.skillId = skillId;
    }

    public UserSkillKey() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserSkillKey that = (UserSkillKey) o;
        return Objects.equals(userId, that.userId) && Objects.equals(skillId, that.skillId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, skillId);
    }
}
