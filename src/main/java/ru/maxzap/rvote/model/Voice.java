package ru.maxzap.rvote.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Voice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @Column(name = "dateTime")
    private LocalDateTime dateTime;
    @ManyToOne
    private User user;
    @OneToOne
    private Menu menu;
//    id       INTEGER auto_increment PRIMARY KEY,
//    dateTime TIMESTAMP NOT NULL,
//    user_id  INTEGER   NOT NULL,
//    menu_id  INTEGER   NOT NULL,
//    FOREIGN KEY (user_id) REFERENCES user (id) ON DELETE CASCADE,
//    FOREIGN KEY (menu_id) REFERENCES menu (id) ON DELETE CASCADE
}
