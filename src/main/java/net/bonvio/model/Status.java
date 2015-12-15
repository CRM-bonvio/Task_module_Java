package net.bonvio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by igorjan on 15.12.15.
 * Banana
 */

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer field;

    public Status(){}

    public Status(Integer id, String name, Integer field) {
        this.id = id;
        this.name = name;
        this.field = field;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getField() {
        return field;
    }
}
