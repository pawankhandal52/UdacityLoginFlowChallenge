package com.khandal.udacityloginflow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ForgotActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        /*ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null){
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }*/
        
    }
    
  /*  @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
    
    public void sendPasswordLink(View view) {
        Toast.makeText(this, "Implment soon", Toast.LENGTH_SHORT).show();
        finish();
    }
}
