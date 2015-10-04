package org.yangjiesleep.storesys;



import tian.biye.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class WelcomeActivity extends Activity{  
    private final int SPLASH_DISPLAY_LENGHT = 3000; //�ӳ�����    
      
    @Override   
    public void onCreate(Bundle savedInstanceState) {   
        super.onCreate(savedInstanceState);   
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.welcome);   
        new Handler().postDelayed(new Runnable(){   
    
         @Override   
         public void run() {   
             Intent mainIntent = new Intent(WelcomeActivity.this, StoreManagementActivity.class);   
             WelcomeActivity.this.startActivity(mainIntent);   
             WelcomeActivity.this.finish();   
         }   
              
        }, SPLASH_DISPLAY_LENGHT);   
    }   
  
}  