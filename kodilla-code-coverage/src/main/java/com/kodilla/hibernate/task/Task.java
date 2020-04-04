package com.kodilla.hibernate.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "TASKS")
public class Task {
    private int id;
    private String description;
    private LocalDate created;
    private int duration;
    private TaskFinancialDetails taskFinancialDetails;

    public Task() {
    }

    public Task(String description, int duration) {
        this.description = description;
        this.created = LocalDate.now();
        this.duration = duration;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name="DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @NotNull
    @Column(name="CREATED")
    public LocalDate getCreated() {
        return created;
    }

    @Column(name="DURATION")
    public int getDuration() {
        return duration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "TASKS_FINANCIALS_ID")
    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }
}