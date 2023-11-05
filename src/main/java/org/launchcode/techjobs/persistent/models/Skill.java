package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 250, message = "Field must be within 250 characters in length.")
    public String description;

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }


}
