package net.yorksolutions.coleenyartcapstonebe.entity;

import javax.persistence.*;

@Entity
public class FinishedChoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;

    private String text;

    public FinishedChoice() {
    }

    public Long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
