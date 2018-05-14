package com.khandal.udacityloginflow;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    private SessionManager sessionManager;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        sessionManager = new SessionManager(this);
    
        moveToNextScreen();
    }
    
    public void moveToNextScreen() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    if (sessionManager.checkIsLoggedIn()){
                        startActivity(new Intent(SplashActivity.this,HomeActivity.class));
                    }else{
                        startActivity(new Intent(SplashActivity.this,LoginActivity.class));
                    }
            }
        }, 1000);
    }
}
