package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message = "Field cannot be left blank. Try again.")
    @Size(min = 1, max = 100, message = "Name does not fit.")
    private String location;

    public Employer(){};

    public void setLocation(String location) {
        this.location = location;
    }

    //Models 2.2 I think this is correct
    public String getLocation() {
        return location;
    }
}
