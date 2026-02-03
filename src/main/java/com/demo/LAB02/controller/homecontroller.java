package com.demo.LAB02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class homecontroller {
    @GetMapping("/home")
    public String Index(){
        return "index";
    }
}
