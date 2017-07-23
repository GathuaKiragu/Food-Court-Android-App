package com.epicodus.myrestaurants.ui;

/**
 * Created by kiragu on 6/11/17.
 */

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.epicodus.myrestaurants.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LandingActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.sign1)
    Button mSign1;
    @Bind(R.id.login1)
    Button mButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        ButterKnife.bind(this);

        mButton1.setOnClickListener(this);
        mSign1.setOnClickListener(this);
//Method to run landing activity only after installation
//        SharedPreferences pref = getSharedPreferences("ActivityPREF", Context.MODE_PRIVATE);
//        if (pref.getBoolean("activity_executed", false)) {
//            Intent intent = new Intent(this, MainActivity.class);
//            startActivity(intent);
//            finish();
//        } else {
//            SharedPreferences.Editor ed = pref.edit();
//            ed.putBoolean("activity_executed", true);
//            ed.commit();
//
//        }
    }

    public void onClick(View v) {

        if (v == mButton1) {
            Intent intent = new Intent(LandingActivity.this, LoginActivity.class);
            startActivity(intent);
        }

        if (v == mSign1) {
            Intent intent = new Intent(LandingActivity.this, CreateAccountActivity.class);
            startActivity(intent);
        }

    }
}

