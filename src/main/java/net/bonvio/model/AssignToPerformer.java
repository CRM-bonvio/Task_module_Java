package net.bonvio.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by igorjan on 17.12.15.
 * Banana
 */

@Entity
public class AssignToPerformer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Position position;
    @ManyToOne
    private Employee employee;
    @ManyToOne
    private Department department;
    @ManyToOne
    private Assign assign;

    public AssignToPerformer(){}
}
