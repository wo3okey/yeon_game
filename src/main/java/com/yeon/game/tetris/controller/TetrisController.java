package com.yeon.game.tetris.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TetrisController {
    @GetMapping(value = "/")
    public String index() {

        // 전달 할 jap 페이지
        return "index";
    }
}
