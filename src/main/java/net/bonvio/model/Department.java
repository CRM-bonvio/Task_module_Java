package net.bonvio.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by igorjan on 15.12.15.
 * Banana
 */

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "department")
    private List<AssignToPerformer> assignToPerformerList;

    @OneToMany(mappedBy = "department")
    private List<Employee> employeeList;

    public Department(){}


}
