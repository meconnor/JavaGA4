package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    private Employer employer;

    @ManyToMany
    @NotNull(message = "Field Required.")
    private List<Skill> skills;

    public Job() {
    }

    // Initialize the id and value fields. Refactored.
    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters. Refactored.

    public Employer getEmployer() { return employer; }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() { return skills; }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
