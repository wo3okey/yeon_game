package com.yeon.game.tetris.repository;

import com.yeon.game.tetris.model.TetrisRank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TetrisRankRepository extends JpaRepository<TetrisRank, Long> {

//    @Query("select m from tetris_rank")
    List<TetrisRank> findAll();

//    @Query("select m from TetrisRank m where m.no = ?1")
    TetrisRank findByNo(int no);
}
