package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
    }
    public void loadLightweight(View v){
        setContentView(R.layout.lightweight);

    }

    public void loadmainmenu(View v){
        setContentView(R.layout.main_menu);
    }
}