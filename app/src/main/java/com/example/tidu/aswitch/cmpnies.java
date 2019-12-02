package com.example.tidu.aswitch;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class cmpnies extends AppCompatActivity {

    CardView imageView,imageView1,imageView2,imageView3;ImageView img11,img12,img13,img14;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmpnies);
        imageView = findViewById(R.id.cardView4);
        imageView1 = findViewById(R.id.cardView);
        imageView2=findViewById(R.id.cardView3);
        imageView3=findViewById(R.id.cardView2);
        img11=findViewById(R.id.imageView11);
        img12=findViewById(R.id.imageView12);
        img13=findViewById(R.id.imageView13);
        img14=findViewById(R.id.imageView14);
        textView=findViewById(R.id.tvcon);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(img12.getVisibility()==View.INVISIBLE)
                {
                    startActivity(new Intent(cmpnies.this,TaskRabbit.class));
                    img12.setVisibility(View.VISIBLE);
                }
                else
                    img12.setVisibility(View.INVISIBLE);
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img11.getVisibility()==View.INVISIBLE)

                {
                    startActivity(new Intent(cmpnies.this,LyftActivity.class));

                    img11.setVisibility(View.VISIBLE);
                }
                else
                    img11.setVisibility(View.INVISIBLE);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img13.getVisibility()==View.INVISIBLE)

                {
                    startActivity(new Intent(cmpnies.this,UberActivity.class));

                    img13.setVisibility(View.VISIBLE);
                }
                else
                    img13.setVisibility(View.INVISIBLE);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img14.getVisibility()==View.INVISIBLE)

                {
                    startActivity(new Intent(cmpnies.this,Grubhub.class));

                    img14.setVisibility(View.VISIBLE);
                }
                else
                    img14.setVisibility(View.INVISIBLE);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cmpnies.this,markets.class));
            }
        });
    }
}
