package com.coltennye.omnilog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.persistence.EntityManager;

@Controller
public class MainController {

    @RequestMapping({"/home","/"})
    public String home(ModelMap mm) {

        return "home";
    }

    @RequestMapping("/hello")
    public String hello(ModelMap mm) {
        return "hello";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
