package com.ech.bootexample.bootexample.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kavindu on 6/4/2018.
 */
@RestController
public class MainController {

    @RequestMapping("/test")
    public String test() {

        return "hello-test";
    }
}


