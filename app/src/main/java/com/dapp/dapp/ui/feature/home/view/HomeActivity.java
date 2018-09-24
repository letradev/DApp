package com.dapp.dapp.ui.feature.home.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dapp.dapp.R;
import com.dapp.dapp.ui.component.BaseActivity;
import com.dapp.dapp.ui.feature.map.view.MapActivity;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }

    public void onDriverClick(View view) {
        moveToActivity(MapActivity.class);
    }
}
