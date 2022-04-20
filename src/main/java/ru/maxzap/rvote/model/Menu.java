package ru.maxzap.rvote.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @Column(name = "date")
    private LocalDate date;
    //@ManyToOne(orphanRemoval = true, cascade = CascadeType.PERSIST, mappedBy = "orderRequest")
    //@OneToMany(orphanRemoval = true, cascade = CascadeType.PERSIST, mappedBy = "orderRequest")
    @ManyToOne
    private Restaurant restaurant;
    @OneToMany
    private List<Dish> dishes;
}

//    id      INTEGER auto_increment PRIMARY KEY,
//        date    date    NOT NULL,
//        restaurant_id INTEGER NOT NULL,
//        FOREIGN KEY (restaurant_id) REFERENCES restaurant (id) ON DELETE CASCADE