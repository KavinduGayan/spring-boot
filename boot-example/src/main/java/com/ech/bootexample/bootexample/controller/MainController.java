package com.ech.bootexample.bootexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Kavindu on 6/4/2018.
 */
@Controller
public class MainController {

    @RequestMapping("/test")
    public String test() {
        return "hello";
    }
}


