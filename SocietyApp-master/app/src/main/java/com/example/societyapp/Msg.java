package com.example.societyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Msg extends AppCompatActivity {

    private static final  int MY_PERMISSIONS_REQUEST_SENDS_SMS=0;
    EditText msg,ph;
    String msg1,no;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);

        msg=(EditText)findViewById(R.id.et_msg);
        ph=(EditText)findViewById(R.id.et_ph);
        send=(Button)findViewById(R.id.b_send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendTextMsg();
            }
        });
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)!= PackageManager.PERMISSION_GRANTED)
        {
            if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.SEND_SMS)){

            }
            else {
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},MY_PERMISSIONS_REQUEST_SENDS_SMS);
            }

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch(requestCode)
        {
            case MY_PERMISSIONS_REQUEST_SENDS_SMS:{
                if(grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED)
                {
                    Toast.makeText(this,"thanks for permitting",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(this,"denied permission",Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
    public void sendTextMsg()
    {
        msg1=msg.getText().toString();
        no=ph.getText().toString();

        SmsManager smsManager=SmsManager.getDefault();
        smsManager.sendTextMessage(no,null,msg1,null,null);
        Toast.makeText(this,"msg is send",Toast.LENGTH_SHORT).show();
    }
}
