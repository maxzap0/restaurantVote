package ru.maxzap.rvote.model;

import javax.persistence.*;

@Entity
@Table(name = "dish")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="title")
    private String title;
    //ToDo select data type for price
    @Column(name = "price")
    private Double price;

    //id, title, price
}
