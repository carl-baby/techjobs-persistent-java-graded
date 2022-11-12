package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Field cannot be left blank. Try again.")
    @Size(min = 1, max = 500, message = "Must include description of job.")
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Skill(){};
    //2.3 again, i think this is correct
}