package com.Nimish.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
    @RequestMapping("/")
    public String Greet()
    {
        return "Welcome to Nimish's world";
    }
    @RequestMapping("/about")
    public String about()
    {
        return "Sorry you are not a Human";
    }
}
