package com.epicodus.myrestaurants.util;

/**
 * Created by kiragu on 6/11/17.
 */

public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}
