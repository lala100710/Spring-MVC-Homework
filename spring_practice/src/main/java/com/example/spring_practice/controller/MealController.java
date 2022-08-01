package com.example.spring_practice.controller;

import com.example.spring_practice.model.Meal;
import com.example.spring_practice.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value ="/meal" )
public class MealController {
    @Autowired
    MealService mealService;
    @GetMapping()
    public String getMealByName(@RequestParam String name, Model model){
        Meal meal=this.mealService.getMealByName(name);
        model.addAttribute("meals",meal);
        return  "meals";
    }


}
