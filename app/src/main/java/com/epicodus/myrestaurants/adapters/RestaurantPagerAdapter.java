package com.epicodus.myrestaurants.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.epicodus.myrestaurants.models.Restaurant;
import com.epicodus.myrestaurants.ui.RestaurantDetailFragment;

import java.util.ArrayList;

public class RestaurantPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Restaurant> mRestaurants;
<<<<<<< HEAD
    private String mSource;

    public RestaurantPagerAdapter(FragmentManager fm, ArrayList<Restaurant> restaurants, String source) {
        super(fm);
        mRestaurants = restaurants;
        mSource = source;
=======

    public RestaurantPagerAdapter(FragmentManager fm, ArrayList<Restaurant> restaurants) {
        super(fm);
        mRestaurants = restaurants;
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
    }

    @Override
    public Fragment getItem(int position) {
<<<<<<< HEAD
        return RestaurantDetailFragment.newInstance(mRestaurants, position, mSource);
=======
        return RestaurantDetailFragment.newInstance(mRestaurants.get(position));
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
    }

    @Override
    public int getCount() {
        return mRestaurants.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mRestaurants.get(position).getName();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
