package com.yeon.game.tetris.controller;

import com.yeon.game.tetris.model.TetrisRank;
import com.yeon.game.tetris.service.TetrisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TetrisController {
    final private TetrisService tetrisService;

    @Autowired
    public TetrisController(TetrisService tetrisService) {
        this.tetrisService = tetrisService;
    }

    @GetMapping(value = "/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("tetris");
        modelAndView.addObject("rankList", tetrisService.getTetrisRankList());
        return modelAndView;
    }
}
