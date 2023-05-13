package com.geekster.Restaurant.management.service.controller;

import com.geekster.Restaurant.management.service.moduls.Foods;
import com.geekster.Restaurant.management.service.moduls.Restaurant;
import com.geekster.Restaurant.management.service.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {
    @Autowired
    private FoodService foodService;

    @PostMapping("/addFood")
    public String addFood(@RequestBody Foods food){
        return foodService.addFood(food);
    }

}
