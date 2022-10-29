package com.softquark.application.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Augusto Vicente
 */
@Data
@Entity
@Table(name = "t_prueba1")
public class Prueba1 implements Serializable {

    public Prueba1() {
    }

    public Prueba1(String col1) {
        this.col1 = col1;
    }

    public Prueba1(long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "col1")
    private String col1;
}
