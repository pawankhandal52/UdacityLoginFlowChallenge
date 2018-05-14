package com.khandal.udacityloginflow;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private TextInputEditText mEmailTextInputEditText, mPasswordTextInputEditText;
    private SessionManager sessionManager;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mEmailTextInputEditText = findViewById(R.id.edittext_email);
        mPasswordTextInputEditText = findViewById(R.id.edittext_password);
    
        sessionManager = new SessionManager(this);
    }
    
    public void loginToYourApp(View view) {
        if (mEmailTextInputEditText.getText().toString().length() <= 0){
            mEmailTextInputEditText.setError("User Proper Email");
            return;
        }
    
        if (mPasswordTextInputEditText.getText().toString().length() <= 0){
            mPasswordTextInputEditText.setError("User Proper Password");
            return;
        }
        sessionManager.setIsLoggedin(true);
        startActivity(new Intent(LoginActivity.this,HomeActivity.class));
    }
    
    public void loginWithGoogle(View view) {
        Toast.makeText(this, "Implement soon", Toast.LENGTH_SHORT).show();
    }
    
    public void loginWithFacebook(View view) {
        Toast.makeText(this, "Implement soon", Toast.LENGTH_SHORT).show();
    }
    
    public void signup(View view) {
        startActivity(new Intent(LoginActivity.this,SignupActivity.class));
    }
    
    public void forgotPassword(View view) {
        startActivity(new Intent(LoginActivity.this,ForgotActivity.class));
    }
    
    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}
