package com.example.societyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Rules extends AppCompatActivity {

    TextView mtitlewidow,mMessagewindow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        mtitlewidow=(TextView)findViewById(R.id.titleWindow);
        mMessagewindow=(TextView)findViewById(R.id.messageWindow);

        mtitlewidow.setText("Rules");
        StringBuilder stringBuilder=new StringBuilder();

        String rul="1.Before starting any civil work, carpentry, painting, renovation etc in their flats every member of the society needs to take proper permission of the committee. In case if anyone doesn’t follow this rule then he/she shall abide to pay certain amount of penalty.";
        String rul1="\n\n2.No member can occupy the area near their front doors, corridors, passage for their personal usage.";
        String rul2="\n\n3.Owners who want to give their flats on rent should take proper permission from the authorized person of the society. All the details of rental agreement, documents of tenant’s bio-data, identity proofs should be submitted to the concern person on prior basis.";
        String rul3="\n\n4.Every member of the society should park their vehicles in their respective allotted parking spaces only. If any illegal parking is done, then that person may cost a penalty for his mistake. Two wheelers should be parked separately. Only one or two vehicles of visitors or guests per flat are allowed to be parked in the premises of the apartment. Other vehicles are supposed to be parked out of the society’s boundary line.";
        String rul4="\n\n5.Salesmen, vendors or any other sellers are not allowed to enter the premises. Owners residing are not allowed to rent their flats for any commercial use as this might create trouble to other society members.";
        String rul5="\n\n6.After using the community hall for any event or function it should be cleaned and no damages should be caused. If any damage is cause strict action against the owner will be taken. Music systems should be played inside of the flats with low volume only.";
        String rul6="\n\n7.Wastage and over usage of water is not allowed. Flat owners will be considered responsible for this act and they have to pay the penalty costs for the same.";
        String rul7="\n\n8.Maintenance charges should be paid from to time. If failed after multiple warnings, any legal action can be processed against the respective person.";
        String rul8="\n\n9..Washing of vehicles, cars, bikes etc in the premises is strictly prohibited. Instead you can use washing area of the society.";
        String rul9="\n\n10.Smoking in lobbies, passage is not allowed. If any irresponsible person is found smoking in the no smoking zone, he/she shall be charged with penalty.";
        stringBuilder.append(rul);
        stringBuilder.append(rul1);
        stringBuilder.append(rul2);
        stringBuilder.append(rul3);
        stringBuilder.append(rul4);
        stringBuilder.append(rul5);
        stringBuilder.append(rul6);
        stringBuilder.append(rul7);
        stringBuilder.append(rul8);
        //stringBuilder.append(rul9);

        mMessagewindow.setText(stringBuilder.toString());

    }
}
