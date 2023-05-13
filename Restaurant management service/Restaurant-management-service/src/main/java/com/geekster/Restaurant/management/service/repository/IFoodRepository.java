package com.geekster.Restaurant.management.service.repository;

import com.geekster.Restaurant.management.service.moduls.Foods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoodRepository extends JpaRepository<Foods , Long> {
}
