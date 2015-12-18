package net.bonvio.model;

import sun.util.resources.cldr.az.TimeZoneNames_az;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by igorjan on 15.12.15.
 * Banana
 */

@Entity
public class Assign implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date date;
    @ManyToOne
    private Task task;
    @OneToMany(mappedBy = "assign")
    private List<AssignToPerformer> assignToPerformerList;

    public Assign(){}

}