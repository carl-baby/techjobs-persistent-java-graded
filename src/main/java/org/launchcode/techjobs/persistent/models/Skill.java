package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    public List<Job> getJobs() {
        return jobs;
    }

    @ManyToMany(mappedBy = "skills")
    @JoinColumn(name = "skill_id")
    private final List<Job> jobs = new ArrayList<>();
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