package net.yorksolutions.coleenyartcapstonebe.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Process {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Stage> stages;

    public Process() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Stage> getStages() {
        return stages;
    }

    public void setStages(List<Stage> stage) { this.stages = stage; }

    public void setChildren(List<Stage> children) {
        this.stages.clear();
        this.stages.addAll(children);
    }


}
