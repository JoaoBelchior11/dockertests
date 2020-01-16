package com.test.docker.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestWebController {


    @GetMapping(value = "/web")
    public String loadWeb(){
        return "Hello I am in the web";
    }



}
