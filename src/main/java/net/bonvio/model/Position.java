package net.bonvio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by igorjan on 15.12.15.
 * Banana
 */

@Entity
public class Position implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(mappedBy = "position")
    private List<AssignToPerformer> assignToPerformerList;

    @OneToMany(mappedBy = "position")
    private List<Employee> employeeList;

    public Position(){}
}
