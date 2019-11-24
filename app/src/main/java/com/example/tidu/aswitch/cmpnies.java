package com.example.tidu.aswitch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class cmpnies extends AppCompatActivity {

    CardView imageView,imageView1,imageView2,imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmpnies);
        imageView = findViewById(R.id.cardView4);
        imageView1 = findViewById(R.id.cardView);
        imageView2=findViewById(R.id.cardView3);
        imageView3=findViewById(R.id.cardView2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cmpnies.this,TaskRabbit.class));
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cmpnies.this,LyftActivity.class));
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cmpnies.this,UberActivity.class));
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cmpnies.this,Grubhub.class));
            }
        });
    }
}
