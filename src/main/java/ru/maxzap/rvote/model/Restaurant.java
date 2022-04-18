package ru.maxzap.rvote.model;

import javax.persistence.*;

@Entity
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
//    id      INTEGER auto_increment PRIMARY KEY,
//    name    VARCHAR(255) NOT NULL,
//    address VARCHAR(255) NOT NULL
}
