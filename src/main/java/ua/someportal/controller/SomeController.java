package ua.someportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SomeController {

    @RequestMapping("/")
    public String onIndex(){
        return "index";
    }
}
