package net.bonvio.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by igorjan on 15.12.15.
 * Banana
 */

@Entity
public class File implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String file;

    @ManyToOne
    private Task task;

    public File(){}

}
