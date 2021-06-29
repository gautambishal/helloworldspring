package com.example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/about")
    public String index(){
        System.out.println("i am inside about");
        return "index";
    }
}
