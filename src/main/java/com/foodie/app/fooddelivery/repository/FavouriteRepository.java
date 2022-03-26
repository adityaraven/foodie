package com.foodie.app.fooddelivery.repository;

import java.util.ArrayList;

import com.foodie.app.fooddelivery.model.Favourite;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouriteRepository extends MongoRepository<Favourite , String> {
    public ArrayList<Favourite> findByUserId(String userId);
    public Favourite deleteByFoodIdAndUserId(String foodId, String userId);
    public boolean existsByFoodIdAndUserId(String foodId, String userId);
 
}
