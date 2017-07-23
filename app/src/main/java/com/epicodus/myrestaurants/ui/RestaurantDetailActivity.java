package com.epicodus.myrestaurants.ui;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

<<<<<<< HEAD
import com.epicodus.myrestaurants.Constants;
import com.epicodus.myrestaurants.adapters.RestaurantPagerAdapter;
import com.epicodus.myrestaurants.models.Restaurant;
import com.epicodus.myrestaurants.R;
=======
import com.epicodus.myrestaurants.R;
import com.epicodus.myrestaurants.adapters.RestaurantPagerAdapter;
import com.epicodus.myrestaurants.models.Restaurant;
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class RestaurantDetailActivity extends AppCompatActivity {
    @Bind(R.id.viewPager) ViewPager mViewPager;
<<<<<<< HEAD

    private RestaurantPagerAdapter adapterViewPager;
    ArrayList<Restaurant> mRestaurants = new ArrayList<>();
    private String mSource;
=======
    private RestaurantPagerAdapter adapterViewPager;
    ArrayList<Restaurant> mRestaurants = new ArrayList<>();

>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);
        ButterKnife.bind(this);

<<<<<<< HEAD
        mRestaurants = Parcels.unwrap(getIntent().getParcelableExtra(Constants.EXTRA_KEY_RESTAURANTS));
        int startingPosition = getIntent().getIntExtra(Constants.EXTRA_KEY_POSITION, 0);
        mSource = getIntent().getStringExtra(Constants.KEY_SOURCE);

        adapterViewPager = new RestaurantPagerAdapter(getSupportFragmentManager(), mRestaurants, mSource);
=======
        mRestaurants = Parcels.unwrap(getIntent().getParcelableExtra("restaurants"));

        int startingPosition = getIntent().getIntExtra("position", 0);

        adapterViewPager = new RestaurantPagerAdapter(getSupportFragmentManager(), mRestaurants);
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
        mViewPager.setAdapter(adapterViewPager);
        mViewPager.setCurrentItem(startingPosition);
    }
}
