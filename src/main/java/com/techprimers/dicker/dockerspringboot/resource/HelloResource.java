package com.techprimers.dicker.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloResource {

    Logger LOG = Logger.getLogger(HelloResource.class.getName());

    @GetMapping
    public String hello(){
        LOG.info("I am here");
        return "Hello Me";
    }




}
