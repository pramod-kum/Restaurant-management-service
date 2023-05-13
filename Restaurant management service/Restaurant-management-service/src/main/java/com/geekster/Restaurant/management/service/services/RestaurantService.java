package com.geekster.Restaurant.management.service.services;

import com.geekster.Restaurant.management.service.moduls.Foods;
import com.geekster.Restaurant.management.service.moduls.Restaurant;
import com.geekster.Restaurant.management.service.repository.IFoodRepository;
import com.geekster.Restaurant.management.service.repository.IRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    private IRestaurantRepository iRestaurantRepository;

    @Autowired
    private IFoodRepository iFood;

    public String addRestaurant(Restaurant restaurant) {

      iRestaurantRepository.save(restaurant);

        return "Restuarent added Successfully!!";
    }
}
