package com.foodie.app.fooddelivery.controller;

import java.util.ArrayList;

import com.foodie.app.fooddelivery.model.Favourite;
import com.foodie.app.fooddelivery.service.FavouriteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin
public class FavouriteController {
    
    @Autowired
    FavouriteService favouriteService;

    // @GetMapping(value="/")
    // public String demoString(){
    //     return "Hello";
    // }


    @GetMapping(value="/getfav/{userId}")
    public ArrayList<Favourite> getListOfFavourite(@PathVariable("userId") String userId){
        return favouriteService.getFavourites(userId);
    }


    @PostMapping(value="/addToFav")
    public Favourite addToFavourite(@RequestBody Favourite fav){
        return favouriteService.addToFavourites(fav);
    }

    @GetMapping(value="/favCheck")
    public boolean checkFavourite(@RequestParam("foodId") String foodId, @RequestParam("userId") String userId){
        return favouriteService.checkFavourite(foodId, userId);
    }
    
}
