package com.hackingbuzz.wifiexample1;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button enableButton, disableButton;

    // object reference of any class(variable) declared in outer class ..n we want to use that in inner class method ...we make that object [ final ]

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enableButton=(Button)findViewById(R.id.button1);
        disableButton=(Button)findViewById(R.id.button2);

      final  WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);

        enableButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Toast.makeText(MainActivity.this, "Making Wifi Enabled",Toast.LENGTH_SHORT).show();

                wifi.setWifiEnabled(true);  // need permission  android.permission.CHANGE_WIFI_STATE  // object is final so that we can use it here
            }
        });



        disableButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Making Wifi Disabled",Toast.LENGTH_SHORT).show();
                
                wifi.setWifiEnabled(false);
            }
        });
    }
}
