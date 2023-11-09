package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message = "Field required.")
    @Size(min = 3, max = 100, message = "Field must be between 3 and 100 characters in length.")
    public String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    public final List<Job> jobs = new ArrayList<>();
    public Employer() {}

    public Employer(String location) {
        super();
        this.location = location;
    }
    public String getLocation() { return location; }

    public void setLocation (String location) { this.location = location; }



}
