package com.dapp.dapp.ui.feature.splash.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dapp.dapp.R;
import com.dapp.dapp.ui.component.BaseActivity;
import com.dapp.dapp.ui.feature.home.view.HomeActivity;
import com.dapp.dapp.ui.feature.login.view.LoginActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);


        checkUserAndNavigate();

        finish();


    }

    private void checkUserAndNavigate() {
        moveToActivity(LoginActivity.class);

    }


}
