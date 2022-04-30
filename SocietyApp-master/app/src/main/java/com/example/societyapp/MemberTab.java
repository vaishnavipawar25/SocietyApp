package com.example.societyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MemberTab extends AppCompatActivity {

    Button notice,comp,staff,rules,album,main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_tab);
        notice=(Button)findViewById(R.id.b_notice);
        comp=(Button)findViewById(R.id.b_comp);
        staff=(Button)findViewById(R.id.b_staff);
        rules=(Button)findViewById(R.id.b_rules);
        album=(Button)findViewById(R.id.b_album);
        main=(Button)findViewById(R.id.b_main);

        rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRule();
            }
        });
        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencomp();
            }
        });
        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotice();
            }
        });
        staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStaff();
            }
        });
    }
    public void onRule()
    {
        Intent i=new Intent(this,Rules.class);
        startActivity(i);
    }
    public void opencomp()
    {
        Intent i1=new Intent(this,Complaint.class);
        startActivity(i1);
    }
    public void opennotice()
    {
        Intent i2=new Intent(this,Notice.class);
        startActivity(i2);
    }
    public void openStaff()
    {
        Intent i3=new Intent(this,Staff.class);
        startActivity(i3);
    }
}
