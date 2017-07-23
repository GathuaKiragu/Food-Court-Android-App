package com.epicodus.myrestaurants.adapters;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
<<<<<<< HEAD
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
=======
import android.support.v7.widget.RecyclerView;
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
<<<<<<< HEAD

import com.epicodus.myrestaurants.Constants;
=======
import com.epicodus.myrestaurants.Constants;
import com.epicodus.myrestaurants.R;
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
import com.epicodus.myrestaurants.models.Restaurant;
import com.epicodus.myrestaurants.ui.RestaurantDetailActivity;
import com.epicodus.myrestaurants.util.ItemTouchHelperViewHolder;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
<<<<<<< HEAD
import com.epicodus.myrestaurants.R;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.io.IOException;
import java.util.ArrayList;

public class FirebaseRestaurantViewHolder extends RecyclerView.ViewHolder implements ItemTouchHelperViewHolder {
=======
import com.squareup.picasso.Picasso;
import org.parceler.Parcels;
import java.util.ArrayList;

/**
 * Created by kiragu on 6/6/17.
 */

public class FirebaseRestaurantViewHolder extends RecyclerView.ViewHolder implements ItemTouchHelperViewHolder{
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
    private static final int MAX_WIDTH = 200;
    private static final int MAX_HEIGHT = 200;

    View mView;
    Context mContext;
    public ImageView mRestaurantImageView;

<<<<<<< HEAD
=======

>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
    public FirebaseRestaurantViewHolder(View itemView) {
        super(itemView);
        mView = itemView;
        mContext = itemView.getContext();
<<<<<<< HEAD
    }

    public void bindRestaurant(Restaurant restaurant) {

=======
//        itemView.setOnClickListener(this);
    }

    public void bindRestaurant(Restaurant restaurant) {
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
        mRestaurantImageView = (ImageView) mView.findViewById(R.id.restaurantImageView);
        TextView nameTextView = (TextView) mView.findViewById(R.id.restaurantNameTextView);
        TextView categoryTextView = (TextView) mView.findViewById(R.id.categoryTextView);
        TextView ratingTextView = (TextView) mView.findViewById(R.id.ratingTextView);

<<<<<<< HEAD
        if (!restaurant.getImageUrl().contains("http")) {
            try {
                Bitmap imageBitmap = decodeFromFirebaseBase64(restaurant.getImageUrl());
                mRestaurantImageView.setImageBitmap(imageBitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Picasso.with(mContext)
                    .load(restaurant.getImageUrl())
                    .resize(MAX_WIDTH, MAX_HEIGHT)
                    .centerCrop()
                    .into(mRestaurantImageView);
        }
=======
        Picasso.with(mContext)
                .load(restaurant.getImageUrl())
                .resize(MAX_WIDTH, MAX_HEIGHT)
                .centerCrop()
                .into(mRestaurantImageView);
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2

        nameTextView.setText(restaurant.getName());
        categoryTextView.setText(restaurant.getCategories().get(0));
        ratingTextView.setText("Rating: " + restaurant.getRating() + "/5");
    }

<<<<<<< HEAD
    public static Bitmap decodeFromFirebaseBase64(String image) throws IOException {
        byte[] decodedByteArray = Base64.decode(image, Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(decodedByteArray, 0, decodedByteArray.length);
    }

    @Override
    public void onItemSelected() {
=======
//    @Override
//    public void onClick(View view) {
//        final ArrayList<Restaurant> restaurants = new ArrayList<>();
//        DatabaseReference ref = FirebaseDatabase.getInstance().getReference(Constants.FIREBASE_CHILD_RESTAURANTS);
//        ref.addListenerForSingleValueEvent(new ValueEventListener() {
//
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
//                    restaurants.add(snapshot.getValue(Restaurant.class));
//                }
//
//                int itemPosition = getLayoutPosition();
//
//                Intent intent = new Intent(mContext, RestaurantDetailActivity.class);
//                intent.putExtra("position", itemPosition + "");
//                intent.putExtra("restaurants", Parcels.wrap(restaurants));
//
//                mContext.startActivity(intent);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//            }
//        });
//    }
//    inflating the itemView with the Animator set items

    @Override
    public void onItemSelected(){
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(mContext,
                R.animator.drag_scale_on);
        set.setTarget(itemView);
        set.start();
    }
<<<<<<< HEAD

    @Override
    public void onItemClear() {
=======
//
    public  void onItemClear(){
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(mContext,
                R.animator.drag_scale_off);
        set.setTarget(itemView);
        set.start();
    }
<<<<<<< HEAD

=======
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
}
