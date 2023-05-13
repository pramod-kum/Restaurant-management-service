package com.geekster.Restaurant.management.service.services;

import com.geekster.Restaurant.management.service.moduls.Costumber;
import com.geekster.Restaurant.management.service.moduls.Foods;
import com.geekster.Restaurant.management.service.moduls.OrderFood;
import com.geekster.Restaurant.management.service.moduls.Restaurant;
import com.geekster.Restaurant.management.service.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    IOrderRepository iOrderRepository;
    @Autowired
    private IFoodRepository iFoodRepository;
    @Autowired
    private IRestaurantRepository iRestaurantRepository;

    @Autowired
    private IAuthenticationRepository authenticationRepo;
    @Autowired
    private ICostumberRepository costumberRepo;
    public String addOrder(OrderFood orderFood) {
        Long foodId = orderFood.getFoods().getFoodsID();
        Long restaurantId = orderFood.getRestaurant().getRestaurantID();
        Foods foodsObj = iFoodRepository.findById(foodId).get();
        Restaurant restuarentObj = iRestaurantRepository.findById(restaurantId).get();

        orderFood.setFoods(foodsObj);
        orderFood.setRestaurant(restuarentObj);

        iOrderRepository.save(orderFood);

        return "Orderd Successfully!!";
    }

    public boolean check(String emailId, String token) {
        String costumberEmail = costumberRepo.findFirstByCostumberEmailId(emailId).getCostumberEmailId();
//        String costumberToken = authenticationRepo.findFirstByAuthenticationToken(token).get;

        return costumberEmail.equals(emailId);
    }
}
