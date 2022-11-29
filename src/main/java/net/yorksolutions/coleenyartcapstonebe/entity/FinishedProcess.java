package net.yorksolutions.coleenyartcapstonebe.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class FinishedProcess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FinishedStage> finishedStages;

    public FinishedProcess() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public List<FinishedStage> getFinishedStages() {
        return finishedStages;
    }

    public void setFinishedStages(List<FinishedStage> finishedStages) {
        this.finishedStages = finishedStages;
    }
}
