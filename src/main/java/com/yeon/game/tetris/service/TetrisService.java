package com.yeon.game.tetris.service;

import com.yeon.game.tetris.model.TetrisRank;
import com.yeon.game.tetris.repository.TetrisRankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TetrisService {
    private final TetrisRankRepository tetrisRankRepository;

    @Autowired
    public TetrisService(TetrisRankRepository tetrisRankRepository) {
        this.tetrisRankRepository = tetrisRankRepository;
    }

    /**
     * @apiNote 챌린지 목록을 가져옴
     * @param
     * @return List<TetrisRank>
     */
    public List<TetrisRank> getTetrisRankList() {
        return tetrisRankRepository.findAll();
    }

    public TetrisRank getTetrisByNo(int no) {
        TetrisRank post = tetrisRankRepository.findByNo(no);
        return post;
    }
}
