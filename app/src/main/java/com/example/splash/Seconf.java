package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Seconf extends AppCompatActivity {
    public Switch SS1;
    public Switch SS2;
    public Switch SS3;
    ConstraintLayout layout;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconf);
        SS1=findViewById(R.id.s1);
        SS2=findViewById(R.id.s2);
        SS3=findViewById(R.id.s3);
        layout=findViewById(R.id.r1);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Seconf.this,Video.class);
                startActivity(i);
            }
        });




        SS1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(SS1.isChecked()){
                    layout.setBackgroundColor(Color.YELLOW);
                }
                else{
                    layout.setBackgroundColor(Color.GREEN);
                }


            }
        });
        SS2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(SS2.isChecked()){
                    layout.setBackgroundColor(Color.WHITE);
                }
                else {
                    layout.setBackgroundColor(Color.MAGENTA);
                }
            }
        });
        SS3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(SS3.isChecked()){
                    layout.setBackgroundColor(Color.CYAN);
                }
                else {
                    layout.setBackgroundColor(Color.LTGRAY);
                }
            }
        });

    }
}