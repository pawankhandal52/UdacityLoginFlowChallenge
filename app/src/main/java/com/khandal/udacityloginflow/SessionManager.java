package com.khandal.udacityloginflow;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/**
 * Created by stemdot on 5/14/18,27
 */
public class SessionManager {
        //Shared prefrance
        private SharedPreferences sharedPreferences;
        
        //Editor
        private SharedPreferences.Editor editor;
        
        //Mode
        private final int PRIVATE_MODE = 0;
        
        //Name of prefrance
        private static final String PREF_NAME = "Udacity_login_flow";
        
        //Login key
        public static final String IS_LOGGEDIN = "IsLoggedIn";
        
        private Context context;
        
        
        public SessionManager(Context context){
            this.context = context;
            sharedPreferences =  context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
            editor = sharedPreferences.edit();
            editor.apply();
        }
        
        public void setIsLoggedin(boolean isLoggedin){
            editor.putBoolean(IS_LOGGEDIN ,  isLoggedin);
            editor.apply();
        }
        
        public boolean checkIsLoggedIn(){
            return sharedPreferences.getBoolean(IS_LOGGEDIN,false);
        }
    
    /**
     * Clear session details
     * */
    public void logoutUser(){
        // Clearing all data from Shared Preferences
        editor.clear();
        editor.commit();
        
        // After logout redirect user to Loing Activity
        Intent i = new Intent(context, LoginActivity.class);
        // Closing all the Activities
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        
        // Add new Flag to start new Activity
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        
        // Staring Login Activity
        context.startActivity(i);
    }
}
