package net.yorksolutions.coleenyartcapstonebe.entity;

import javax.persistence.*;

@Entity
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String prompt;

    private String type;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(referencedColumnName = "id")
//    private Process process;

    public Stage() {
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public Process getProcess() {
//        return process;
//    }
//
//    public void setProcess(Process process) {
//        this.process = process;
//    }
}
