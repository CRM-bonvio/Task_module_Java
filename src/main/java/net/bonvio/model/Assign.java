package net.bonvio.model;

import sun.util.resources.cldr.az.TimeZoneNames_az;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by igorjan on 15.12.15.
 * Banana
 */

@Entity
public class Assign {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date date;
    @OneToOne
    private Task task;
    @OneToMany
    private List<Position> positionList;

    public Assign(){}

    public Assign(Integer id, Date date, Task task, List<Position> positionList) {
        this.id = id;
        this.date = date;
        this.task = task;
        this.positionList = positionList;
    }

    public Integer getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Task getTask() {
        return task;
    }

    public List<Position> getPosition() {
        return positionList;
    }
}