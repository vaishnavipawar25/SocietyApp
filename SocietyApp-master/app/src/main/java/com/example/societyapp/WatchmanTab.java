package com.example.societyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WatchmanTab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watchman_tab);

    }

    public void onReg(View view){
        startActivity(new Intent(WatchmanTab.this,RegVisitor.class));
    }
    public void onDir(View view){
        startActivity(new Intent(WatchmanTab.this,Directory.class));
    }
}
