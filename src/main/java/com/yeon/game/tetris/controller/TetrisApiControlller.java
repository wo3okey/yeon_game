package com.yeon.game.tetris.controller;

import com.yeon.game.tetris.model.TetrisRank;
import com.yeon.game.tetris.service.TetrisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TetrisApiControlller {
    final private TetrisService tetrisService;

    @Autowired
    public TetrisApiControlller(TetrisService tetrisService) {
        this.tetrisService = tetrisService;
    }

    @PostMapping(value = "/test")
    @ResponseBody
    public TetrisRank getTetrisByNo(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "score", required = false) int score) {
        System.out.println(name);
        return tetrisService.insertTetrisRank(name, score);
    }

}
