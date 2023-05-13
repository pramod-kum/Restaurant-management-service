package com.geekster.Restaurant.management.service.controller;

import com.geekster.Restaurant.management.service.moduls.OrderFood;
import com.geekster.Restaurant.management.service.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/OrderFood/{emailId}/{token}")
    public ResponseEntity<String> OrderFood(@RequestBody OrderFood orderFood, String emailId , String token){
      //return  orderService.addOrder(orderFood);
        HttpStatus status;
        String message = "";


        if(orderService.check(emailId , token)){
           message = orderService.addOrder(orderFood);
            status = HttpStatus.OK;
        }else {
            status = HttpStatus.NO_CONTENT;
            message = "Worng Id And Password";
        }
        return new ResponseEntity<String>(message , status);
    }
}
