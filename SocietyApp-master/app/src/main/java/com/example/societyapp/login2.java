package com.example.societyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login2 extends AppCompatActivity {

    Button submit;
    EditText nm,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        submit=(Button)findViewById(R.id.b_submit);
        nm=(EditText)findViewById(R.id.et_nm);
        pass=(EditText)findViewById(R.id.et_pass);

    }
    public void onLogin(View view){
        if(nm.getText().toString().equals("Secretory")&&pass.getText().toString().equals("secretory")){
            //startActivity(new Intent(this,Secretory.class));
        }
        else if(nm.getText().toString().equals("")&&pass.getText().toString().equals("")){
            Toast.makeText(this,"enter username and password",Toast.LENGTH_SHORT).show();
        }
        else if(nm.getText().toString().equals("")){
            Toast.makeText(this,"enter username",Toast.LENGTH_SHORT).show();
        }
        else if(pass.getText().toString().equals("")){
            Toast.makeText(this,"enter password",Toast.LENGTH_SHORT).show();
        }
        else if(nm.getText().toString().equals("Secretory")){
            if(pass.getText().toString().equals("secretory"))
            {
                //startActivity(new Intent(this,Secretory.class));
            }
            else
            {
                Toast.makeText(this,"invalid password",Toast.LENGTH_SHORT).show();
            }

        }
        else if(pass.getText().toString().equals("secretory")){
            if(nm.getText().toString().equals("Secretory"))
            {
                //startActivity(new Intent(this,Secretory.class));
            }
            else
            {
                Toast.makeText(this,"invalid username",Toast.LENGTH_SHORT).show();
            }

        }

    }
}
