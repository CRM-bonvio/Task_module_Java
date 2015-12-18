package net.bonvio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by igorjan on 15.12.15.
 * Banana
 */

@Entity
public class Status implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer field;

    @OneToMany(mappedBy = "status")
    private List<Task> taskList;

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
