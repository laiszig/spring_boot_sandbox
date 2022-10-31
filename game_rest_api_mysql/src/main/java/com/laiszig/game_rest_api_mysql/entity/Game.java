package com.laiszig.game_rest_api_mysql.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name= "game_title", nullable = false)
    private String title;

    @Column(name="year")
    private String year;

    @Column(name= "publisher")
    private String publisher;

    @Column(name = "platform")
    private String platform;

}
