package net.bonvio.model;

import javax.persistence.*;

/**
 * Created by igorjan on 17.12.15.
 * Banana
 */

@Entity
public class Try {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    Employee performer;
    @OneToOne
    Task task;

    public Try(){}
}
