package com.generation.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TiendaController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
