package com.example.societyapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Reg extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseUser user;
    EditText name,wing,fno,ftype,eaddr,ph,mtype;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        name=(EditText)findViewById(R.id.e_name);
        wing=(EditText)findViewById(R.id.e_wing);
        fno=(EditText)findViewById(R.id.e_number);
        ftype=(EditText)findViewById(R.id.e_flatType);
        eaddr=(EditText)findViewById(R.id.e_email);
        ph=(EditText)findViewById(R.id.e_phone);
        mtype=(EditText)findViewById(R.id.e_member);
        submit=(Button)findViewById(R.id.b_submit);

        registerListeners();
//        comment

    }

    public void registerListeners() {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValid()) {
                    Toast.makeText(Reg.this, "Success", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void registerUser(String email,String pass){
        mAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "DOne", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public boolean isValid(){
        if(name.getText().toString().equals(""))
        {
            Toast.makeText(Reg.this, "Please Enter Your Name", Toast.LENGTH_SHORT).show();
        }
        else if(wing.getText().toString().equals(""))
        {
            Toast.makeText(Reg.this, "Please Enter Your Wing Name", Toast.LENGTH_SHORT).show();
        }
        else if(fno.getText().toString().equals(""))
        {
            Toast.makeText(Reg.this, "Please Enter Your Flat Number", Toast.LENGTH_SHORT).show();
        }
        else if(ftype.getText().toString().equals(""))
        {
            Toast.makeText(Reg.this, "Please Enter Your Flat type", Toast.LENGTH_SHORT).show();
        }
        else if(eaddr.getText().toString().indexOf('@')<1)
        {
            Toast.makeText(Reg.this, "Please Enter Correct Email Address", Toast.LENGTH_SHORT).show();
        }
        else if(ph.getText().toString().length()!=10)
        {
            Toast.makeText(Reg.this, "Please Enter Correct Phone Number", Toast.LENGTH_SHORT).show();
        }
        else
        {
            return true;
        }
        return false;
    }
}
