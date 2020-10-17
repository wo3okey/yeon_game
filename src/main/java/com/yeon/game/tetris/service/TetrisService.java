package com.yeon.game.tetris.service;

import com.yeon.game.tetris.model.TetrisRank;
import com.yeon.game.tetris.repository.TetrisRankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TetrisService {
    private final TetrisRankRepository tetrisRankRepository;

    @Autowired
    public TetrisService(TetrisRankRepository tetrisRankRepository) {
        this.tetrisRankRepository = tetrisRankRepository;
    }

    /**
     * @param
     * @return List<TetrisRank>
     * @apiNote 테트리스 랭킹정보를 가져옴
     */
    public List<TetrisRank> getTetrisRankList() {
        return tetrisRankRepository.findTop5ByOrderByTetrisScoreDesc();
    }


    /**
     * @param
     * @return List<TetrisRank>
     * @apiNote 테트리스 랭킹정보 입력
     */
    public TetrisRank insertTetrisRank(String name, int score) {
        TetrisRank tetrisRank = new TetrisRank(name, score, new Date());
        System.out.println(tetrisRank.toString());
        return tetrisRankRepository.save(tetrisRank);
    }
}
