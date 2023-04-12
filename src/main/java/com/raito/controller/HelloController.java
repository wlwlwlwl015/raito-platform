package com.raito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping(value = "/toHelloPage")
    public String toHelloPage(Model model){
        model.addAttribute("attr",123);
        return "hello";
    }
}
