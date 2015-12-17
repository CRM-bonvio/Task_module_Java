package net.bonvio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
    private Integer count;
    @ManyToOne
    private Condition condition;
    @ManyToOne
    private Priority priority;
    @OneToMany(mappedBy = "task")
    private List<Assign> assignList;
    @ManyToOne
    private Status status;
    @ManyToOne
    private Employee employer;
    @ManyToMany(mappedBy = "todoList")
    private List<Employee> employeeList;
    @OneToMany(mappedBy = "task")
    private List<File> fileList;

    public Task(){}

}