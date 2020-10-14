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

    @GetMapping(value = "/{no}")
    @ResponseBody
    public TetrisRank getTetrisByNo(@PathVariable("no") int no) {
        System.out.println("###########################");
        System.out.println(no);
        System.out.println(tetrisService.getTetrisByNo(no).toString());
        System.out.println("###########################");
        return tetrisService.getTetrisByNo(no);
    }

}
