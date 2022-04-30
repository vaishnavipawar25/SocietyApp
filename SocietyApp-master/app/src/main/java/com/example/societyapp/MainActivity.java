package com.example.societyapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button admin,sec,mem,watch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        admin=(Button)findViewById(R.id.b_admin);
        sec=(Button)findViewById(R.id.b_Secretory);
        mem=(Button)findViewById(R.id.b_Member);
        watch=(Button)findViewById(R.id.b_Watchman);

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdmin();
            }
        });
        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecretory();
            }
        });
        mem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMember();
            }
        });
        watch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWatchman();
            }
        });
    }
    public void openAdmin()
    {
        Intent i=new Intent(this,login1.class);
        startActivity(i);
    }
    public void openSecretory()
    {
        Intent i1=new Intent(this,login2.class);
        startActivity(i1);
    }
    public void openMember()
    {
        Intent i2=new Intent(this,login3.class);
        startActivity(i2);
    }
    public void openWatchman()
    {
        Intent i3=new Intent(this,login4.class);
        startActivity(i3);
    }
}