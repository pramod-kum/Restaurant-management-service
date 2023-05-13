package com.geekster.Restaurant.management.service.dto;

import com.geekster.Restaurant.management.service.moduls.Costumber;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SignInInputData {
    private String userEmailId;
    private String password;

}
