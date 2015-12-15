package net.bonvio.model;

import sun.util.resources.cldr.az.TimeZoneNames_az;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

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
    private Task task;
    private Position position;

    public Assign(Integer id, Date date, Task task, Position position) {
        this.id = id;
        this.date = date;
        this.task = task;
        this.position = position;
    }

    public Assign(){}
}
