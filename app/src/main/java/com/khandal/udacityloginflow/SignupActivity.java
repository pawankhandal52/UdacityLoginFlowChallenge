package com.khandal.udacityloginflow;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SignupActivity extends AppCompatActivity {
    TextInputEditText mNameTextInputEditText,mEmailTextInputEditText,mPasswordTextInputEditText;
    SessionManager sessionManager;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        mNameTextInputEditText = findViewById(R.id.edittext_name);
        mEmailTextInputEditText = findViewById(R.id.edittext_email);
        mPasswordTextInputEditText = findViewById(R.id.edittext_password);
        sessionManager = new SessionManager(this);
        
    }
    
    public void registerUser(View view) {
        if (mNameTextInputEditText.getText().toString().length() <= 0){
            mNameTextInputEditText.setError("User Proper Email");
            return;
        }
        if (mEmailTextInputEditText.getText().toString().length() <= 0){
            mEmailTextInputEditText.setError("User Proper Email");
            return;
        }
    
        if (mPasswordTextInputEditText.getText().toString().length() <= 0){
            mPasswordTextInputEditText.setError("User Proper Password");
            return;
        }
        sessionManager.setIsLoggedin(true);
        startActivity(new Intent(SignupActivity.this,HomeActivity.class));
    }
}
