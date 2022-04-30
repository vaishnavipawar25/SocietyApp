package com.example.societyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Directory extends AppCompatActivity {

    TextView mem1,mem2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);

        mem1=(TextView)findViewById(R.id.tv_mem1) ;
        mem2=(TextView)findViewById(R.id.tv_mem2) ;

        mem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Directory.this,callmsg.class));
            }
        });
        mem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Directory.this, callmsg.class));
            }
        });
    }
}
