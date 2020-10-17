package com.yeon.game.tetris.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tetris_rank", schema = "yeon_game")
public class TetrisRank {

    public TetrisRank(String name, int score, Date date) {
        this.userName = name;
        this.tetrisScore = score;
        this.rankDate = date;
    }

    public TetrisRank() {

    }

    @Id
    @Column(name = "RANK_NO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int rankNo;

    @Column(name = "USER_NAME")
    String userName;

    @Column(name = "TETRIS_SCORE")
    int tetrisScore;

    @Column(name = "TETRIS_RANK")
    int tetrisRank;

    @Column(name = "RANK_DATE")
    Date rankDate;
}
