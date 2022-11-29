package net.yorksolutions.coleenyartcapstonebe.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class FinishedStage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String prompt;

    private String answer;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FinishedChoice> finishedChoices;

    public FinishedStage() {
    }

    public Long getId() {
        return id;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public List<FinishedChoice> getFinishedChoices() {
        return finishedChoices;
    }

    public void setFinishedChoices(List<FinishedChoice> finishedChoices) {
        this.finishedChoices = finishedChoices;
    }
}
