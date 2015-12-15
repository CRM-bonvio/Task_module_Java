package net.bonvio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by igorjan on 15.12.15.
 * Banana
 */

@Entity
public class Condition implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private boolean isReady;
    private boolean isAccepted;

    public Condition(){}

    public Condition(Integer id, boolean isAccepted, boolean isReady, String name) {
        this.id = id;
        this.isAccepted = isAccepted;
        this.isReady = isReady;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isReady() {
        return isReady;
    }

    public boolean isAccepted() {
        return isAccepted;
    }
}
