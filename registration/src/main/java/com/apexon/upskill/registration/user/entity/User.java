package com.apexon.upskill.registration.user.entity;
import com.apexon.upskill.registration.skills.model.Skill;
import com.apexon.upskill.registration.user.enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @NotBlank(message = "FirstName should not be empty")
    private String firstName;

    @NotBlank(message = "LastName should not be empty")
    private String lastName;

    @Email(message = "Invalid Email/Username")
    @Column(nullable = false, unique = true)
    private String userName;

    @NotBlank(message = "Password should not be empty")
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    private String designation;

    @ManyToMany
    @JoinTable(
            name = "user_skills",                    // join table name
            joinColumns = @JoinColumn(name = "user_id"),    // FK to user
            inverseJoinColumns = @JoinColumn(name = "skill_id") // FK to skill
    )
    private Set<Skill> skills = new HashSet<>();
}
