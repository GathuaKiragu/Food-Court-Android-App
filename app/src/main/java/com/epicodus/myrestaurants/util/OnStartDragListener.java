package com.epicodus.myrestaurants.util;

import android.support.v7.widget.RecyclerView;

import com.epicodus.myrestaurants.adapters.FirebaseRestaurantViewHolder;

/**
 * Created by kiragu on 6/11/17.
 */

public interface OnStartDragListener {
    void onStartDrag(RecyclerView.ViewHolder viewHolder);
}
