package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();

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
