package com.khandal.udacityloginflow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    SessionManager sessionManager;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        sessionManager = new SessionManager(this);
    }
    
    public void logout(View view) {
        sessionManager.logoutUser();
    
    }
    
    @Override
    public void onBackPressed() {
        finishAffinity();
        
    }
}
