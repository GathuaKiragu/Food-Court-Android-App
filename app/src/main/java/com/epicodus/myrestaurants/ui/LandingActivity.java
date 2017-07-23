package com.epicodus.myrestaurants.ui;

/**
 * Created by kiragu on 6/11/17.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.epicodus.myrestaurants.R;

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
    }

    @Override
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
