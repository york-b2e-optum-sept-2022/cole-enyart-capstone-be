package net.yorksolutions.coleenyartcapstonebe.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String prompt;

    private String type;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Choice> choices;

    public Stage() {
    }

    public Long getId() {
        return id;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) { this.prompt = prompt; }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choice) {
        this.choices = choice;
    }
}
