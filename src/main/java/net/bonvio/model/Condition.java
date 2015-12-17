package net.bonvio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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

    @OneToMany(mappedBy = "condition")
    private List<Task> taskList;

    public Condition(){}

}
