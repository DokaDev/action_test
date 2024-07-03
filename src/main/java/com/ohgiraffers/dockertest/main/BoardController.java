package com.ohgiraffers.dockertest.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/board")
public class BoardController {
    @GetMapping("/list")
    public String list(Model model) {



        model.addAttribute("boardList", null);
        return "main/board";
    }
}
