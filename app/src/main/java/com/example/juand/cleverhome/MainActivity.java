package com.example.juand.cleverhome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("bluetooth");
        tabSpec.setContent(R.id.bluetoothTab);
        tabSpec.setIndicator("Bluetooth");

        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("ethernet");
        tabSpec.setContent(R.id.ethernetTab);
        tabSpec.setIndicator("Ethernet");

        tabHost.addTab(tabSpec);
    }
}
