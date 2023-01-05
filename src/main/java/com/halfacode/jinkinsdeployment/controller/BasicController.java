package com.halfacode.jinkinsdeployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/get")
    public String getData(){
        return "welcome to jinkins installed after many time";
    }
}
