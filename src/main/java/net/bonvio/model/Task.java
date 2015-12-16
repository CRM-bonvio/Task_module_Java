package net.bonvio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by igorjan on 15.12.15.
 * Banana
 */

@Entity
public class Task implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private Date dateCreate;
    private Date dateStart;
    private Date dateClose;
    @OneToOne
    private Condition startCondition;
    @OneToOne
    private Priority priority;
    @OneToOne
    private Status status;
    @ManyToOne
    private Employee employer;
    @ManyToOne
    private Employee employee;

    public Task(){}

    public Task(Integer id, String name, String description, Date dateCreate, Date dateStart, Date dateClose, Condition startCondition, Priority priority, Status status, Employee employer, Employee employee) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateCreate = dateCreate;
        this.dateStart = dateStart;
        this.dateClose = dateClose;
        this.startCondition = startCondition;
        this.priority = priority;
        this.status = status;
        this.employer = employer;
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public Date getDateClose() {
        return dateClose;
    }

    public Condition getStartCondition() {
        return startCondition;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }

    public Employee getEmployer() {
        return employer;
    }

    public Employee getEmployee() {
        return employee;
    }
}