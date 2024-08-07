package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
       model.addAttribute("name", "Substring Technologies");
       model.addAttribute("Email","yogeshsanasCmss@gmail.com");
       model.addAttribute("githubRepo", "http://github.com/yogeshsanas");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(Model model){
        return "about";
    }

    @RequestMapping("/services")
    public String servicePage(Model model){
        return "services";
    }
}
