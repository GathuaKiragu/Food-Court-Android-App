package com.epicodus.myrestaurants.util;

/**
 * Created by kiragu on 5/29/17.
 */

import com.epicodus.myrestaurants.models.Restaurant;

import java.util.ArrayList;

public interface OnRestaurantSelectedListener {
    public void onRestaurantSelected(Integer position, ArrayList<Restaurant> restaurants, String source);

}
