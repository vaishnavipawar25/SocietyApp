package com.example.societyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegVisitor extends AppCompatActivity {
    EditText nm,memnm,ph,time1,time2,numvisitors,carno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_visitor);
        nm = (EditText) findViewById(R.id.et_nm);
        memnm = (EditText) findViewById(R.id.et_mem);
        ph = (EditText) findViewById(R.id.et_ph);
        time1 = (EditText) findViewById(R.id.et_time1);
        time2 = (EditText) findViewById(R.id.et_time2);
        numvisitors = (EditText) findViewById(R.id.et_numvisitor);
        carno=(EditText)findViewById(R.id.et_carno);
    }
    public void onSubmit(View view){
        if(nm.getText().toString().equals("")&&memnm.getText().toString().equals("")&&ph.getText().toString().equals("")&&time1.getText().toString().equals("")&&time2.getText().toString().equals("")&&numvisitors.getText().toString().equals("")&&carno.getText().toString().equals(""))
        {
            Toast.makeText(this,"enter all fields properly",Toast.LENGTH_SHORT).show();
        }
        else if(nm.getText().toString().equals(""))
        {
            Toast.makeText(this,"enter visitors name",Toast.LENGTH_SHORT).show();
        }
        else if(memnm.getText().toString().equals(""))
        {
            Toast.makeText(this,"enter member name",Toast.LENGTH_SHORT).show();
        }
        else if(ph.getText().toString().equals(""))
        {
            Toast.makeText(this,"enter phone number",Toast.LENGTH_SHORT).show();
        }
        else if(time1.getText().toString().equals(" "))
        {
            Toast.makeText(this,"enter entry time",Toast.LENGTH_SHORT).show();
        }
        else if(time2.getText().toString().equals(" "))
        {
            Toast.makeText(this,"enter entry time",Toast.LENGTH_SHORT).show();
        }
        else if(numvisitors.getText().toString().equals(" "))
        {
            Toast.makeText(this,"enter number of visitors",Toast.LENGTH_SHORT).show();
        }
        else if(ph.getText().toString().length()!=10)
        {
            Toast.makeText(this,"enter valid phone number",Toast.LENGTH_SHORT).show();

        }

        else {
            Toast.makeText(this,"form successfully submited",Toast.LENGTH_SHORT).show();
        }

    }
}
