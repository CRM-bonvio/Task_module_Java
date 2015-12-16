package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mil on 23.11.2015.
 * Banana
 */

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private Department department;

    @OneToOne
    private Position position;

    @OneToMany(mappedBy = "employer")
    @JsonIgnore
    private List<Task> taskList = new ArrayList<>();
    @OneToMany(mappedBy = "employee")
    @JsonIgnore
    private List<Task> todoList = new ArrayList<>();

    public Employee() {
    }

    public Employee(Department department, Position position, List<Task> taskList, List<Task> todoList) {
        this.department = department;
        this.position = position;
        this.taskList = taskList;
        this.todoList = todoList;
    }

    public Integer getId() {
        return id;
    }
    public Department getDepartment() {
        return department;
    }
    public Position getPosition() {
        return position;
    }
    public List<Task> getTaskList() {
        return taskList;
    }
    public List<Task> getTodoList() {
        return todoList;
    }
}
