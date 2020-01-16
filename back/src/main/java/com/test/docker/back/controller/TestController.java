package com.test.docker.back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/back")
    public String loadBack(){
        return "Hello I am in the back";
    }


}
