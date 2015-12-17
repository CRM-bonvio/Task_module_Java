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

    @OneToMany(mappedBy = "employee")
    private List<AssignToPerformer> assignToPerformerList;


    @ManyToOne
    private Department department;

    @ManyToOne
    private Position position;

    @OneToMany(mappedBy = "employer")
    @JsonIgnore
    private List<Task> taskList = new ArrayList<>();
    @ManyToMany(mappedBy = "employeeList")
    @JsonIgnore
    private List<Task> todoList = new ArrayList<>();

    public Employee() {
    }

}
