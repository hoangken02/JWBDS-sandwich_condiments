package com.kenit.sandwichcondiments.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichCondimentsController {
    @GetMapping("")
    public String index() {
        return "index";
    }

    @PostMapping("/save")
    public ModelAndView save(@RequestParam("condiment") String[] condiment) {
        ModelAndView modelAndView = new ModelAndView("info");
        for (int i = 0; i <condiment.length ; i++) {
            modelAndView.addObject(condiment[i],condiment[i]);
        }
        return modelAndView;
    }
}
