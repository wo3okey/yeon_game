package com.yeon.game.tetris.repository;

import com.yeon.game.tetris.model.TetrisRank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TetrisRankRepository extends JpaRepository<TetrisRank, Long> {

    List<TetrisRank> findTop5ByOrderByTetrisScoreDesc();
}
