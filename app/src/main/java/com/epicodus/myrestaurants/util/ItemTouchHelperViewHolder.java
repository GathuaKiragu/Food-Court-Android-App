package com.epicodus.myrestaurants.util;

/**
 * Created by kiragu on 6/15/17.
 */

public interface ItemTouchHelperViewHolder {
//  will handle the updating the appearance of an item
    void onItemSelected();
//Will remove the selected item from the view
    void onItemClear();
}
