package com.foodie.app.fooddelivery.service;

import java.util.ArrayList;

import com.foodie.app.fooddelivery.model.Favourite;
import com.foodie.app.fooddelivery.repository.FavouriteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FavouriteService {
    
    @Autowired
    FavouriteRepository favouriteRepository;

    public ArrayList<Favourite> getFavourites(String userId){
        return favouriteRepository.findByUserId(userId);
      }

      public Favourite addToFavourites(Favourite fav){
       
        if(!checkFavourite(fav.getFoodId(), fav.getUserId())){
          return favouriteRepository.save(fav);
        }else{
          favouriteRepository.deleteByFoodIdAndUserId(fav.getFoodId(), fav.getUserId());
          return fav;
        }
      }

      public boolean checkFavourite(String foodId, String userId){
        return this.favouriteRepository.existsByFoodIdAndUserId(foodId, userId);
      }
}
