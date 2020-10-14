package com.yeon.game.tetris.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tetris_rank", schema = "yeon_game")
public class TetrisRank {

    TetrisRank() {}

    @Id
    @Column(name = "NO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int no;

    @Column(name = "ID")
    String id;

    @Column(name = "SCORE")
    String score;

    @Column(name = "RANK")
    int rank;

    @Column(name = "DATE")
    Date date;
}
