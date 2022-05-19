package com.springboard.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class BaseController {
    private final HttpSession httpSession;

    @GetMapping("/")
    public String index() {
//        SessionUser
        return "index";
    }
}
