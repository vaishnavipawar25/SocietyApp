package com.example.societyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login4 extends AppCompatActivity {

    TextView account;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login4);
        account=(TextView)findViewById(R.id.tv_account);
        submit=(Button)findViewById(R.id.b_submit);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login4.this,Reg.class));
            }
        });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login4.this,WatchmanTab.class));
            }
        });

    }
    public void onSec(View view){

        //startActivity(new Intent(this,Secretory.class));
    }

}

