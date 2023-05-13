package com.geekster.Restaurant.management.service.services;

import com.geekster.Restaurant.management.service.moduls.Foods;
import com.geekster.Restaurant.management.service.moduls.Restaurant;
import com.geekster.Restaurant.management.service.repository.IFoodRepository;
import com.geekster.Restaurant.management.service.repository.IRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    @Autowired
    private IFoodRepository iFoodRepository;
    @Autowired
    private IRestaurantRepository iRestaurant;

    public String addFood(Foods food) {
        Long restaurantId =  food.getFoodsID();

        Restaurant restaurantObj = iRestaurant.findById(restaurantId).get();
        food.setRestaurant(restaurantObj);
        iFoodRepository.save(food);
        return "Food added Successfully!!";
    }
}
