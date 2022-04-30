package com.example.societyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class callmsg extends AppCompatActivity {
    ImageView ph,msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callmsg);

        ph=(ImageView)findViewById(R.id.img_ph);
        msg=(ImageView)findViewById(R.id.img_msg);
        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(callmsg.this,Phone.class));
            }
        });
        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(callmsg.this,Msg.class));
            }
        });

    }
}
