package com.kodilla.hibernate.task;

import com.kodilla.hibernate.tasklist.TaskList;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

@NamedQueries(
        {   @NamedQuery(
                name ="Task.retrieveLongTasks",
                query = "FROM Task WHERE duration > 10"
        ),
             @NamedQuery(
                     name = "Task.retrieveShortTasks",
                     query = "FROM Task WHERE duration <= 10"
             ),
                @NamedQuery(
                        name ="Task.retrieveTasksWithDurationLongerThan",
                        query = "FROM Task WHERE duration > :DURATION"
                )
                }
        )
@NamedNativeQuery(
        name = "Task.retrieveTasksWithEnoughTime",
        query = "SELECT * FROM TASKS" +
                " WHERE DATEDIFF(DATE_ADD(DATE, INTERVAL DURATION DAY), NOW()) > 5",
        resultClass = Task.class
)

@Entity
@Table(name = "TASKS")
public class Task {

    private int id;
    private String description;
    private Date created;
    private int duration;
    private TaskFinancialDetails taskFinancialDetails;
    private TaskList taskList;



    public Task(String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }

    public Task() {}

    @NotNull
    @Id
    @Column(name = "ID", unique = true)
    @GeneratedValue
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }
    @NotNull
    @Column(name = "DATE")
    public Date getCreated() {
        return created;
    }

    private void setCreated(Date created) {
        this.created = created;
    }
    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "TASKS_FINANCIAL_ID")
    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }
    @ManyToOne
    @JoinColumn(name = "TASKLIST_ID")
    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
}
