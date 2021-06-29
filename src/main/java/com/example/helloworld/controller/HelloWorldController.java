package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(){
        return "hello world";
    }

    @GetMapping(value="/index")
    public String indexSecond(){
        return "using get mapping to return this";
    }

}
