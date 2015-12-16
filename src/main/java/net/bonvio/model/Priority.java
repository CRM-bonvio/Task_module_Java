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
public class Priority {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer value;

    public Priority(){}

    public Priority(Integer id, String name, Integer value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getValue() {
        return value;
    }
}
