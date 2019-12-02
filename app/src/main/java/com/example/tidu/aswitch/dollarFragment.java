package com.example.tidu.aswitch;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class dollarFragment extends Fragment {
    TabLayout tabLayout,tabLayout1;
    DisplayMetrics displaymetrics ;
    dollarviewpager pagerAdapter;
    ViewPager viewPager;
    CardView cardView;
    TextView t1,t2,t3;
    ImageView i1,i2;
    public dollarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dollar, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        // super.onViewCreated(view, savedInstanceState);
        tabLayout=getView().findViewById(R.id.tabsdollar2);
        t1=getView().findViewById(R.id.textView8);
        t2=getView().findViewById(R.id.textView11);
        t3=getView().findViewById(R.id.textView12);
        i1=getView().findViewById(R.id.imageView23);
        i2=getView().findViewById(R.id.imageView24);

        viewPager=getView().findViewById(R.id.view_pager_id_dollar);
        pagerAdapter=new dollarviewpager(getFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        tabLayout1=getView().findViewById(R.id.tabsdollar1);
        for(int i=0; i < tabLayout1.getTabCount(); i++) {
            View tab = ((ViewGroup) tabLayout1.getChildAt(0)).getChildAt(i);
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) tab.getLayoutParams();
            p.setMargins(0, 0, 20, 0);
            tab.requestLayout();
        }
        cardView=getView().findViewById(R.id.carddetaildollar);
        /*cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),lyftDetail.class));
            }
        });*/
        tabLayout1.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab){
                int position = tab.getPosition();
                if(position==0)
                {
                    t1.setText("$144.05");t2.setText("12");t3.setText("$28.81");
                    Picasso.with(getContext()).load(R.drawable.i4).into(i1);
                    Picasso.with(getContext()).load(R.drawable.i3).into(i2);

                }
                else
                {
                    t1.setText("$276.50");t2.setText("20");t3.setText("$27.60");
                    Picasso.with(getContext()).load(R.drawable.i1).into(i1);
                    Picasso.with(getContext()).load(R.drawable.i2).into(i2);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        tabLayout.setupWithViewPager(viewPager);
        //getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        LinearLayout layout = ((LinearLayout) ((LinearLayout) tabLayout.getChildAt(0)).getChildAt(0));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) layout.getLayoutParams();
        layoutParams.weight = 0.18f;
        layout.setLayoutParams(layoutParams);
        LinearLayout layout1 = ((LinearLayout) ((LinearLayout) tabLayout.getChildAt(0)).getChildAt(1));
        LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams) layout1.getLayoutParams();
        layoutParams1.weight = 0.488f;
        layout1.setLayoutParams(layoutParams1);
        LinearLayout layout2 = ((LinearLayout) ((LinearLayout) tabLayout.getChildAt(0)).getChildAt(2));
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layout2.getLayoutParams();
        layoutParams2.weight = 0.286f;
        layout2.setLayoutParams(layoutParams2);
        LinearLayout layout3 = ((LinearLayout) ((LinearLayout) tabLayout.getChildAt(0)).getChildAt(3));
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layout3.getLayoutParams();
        layoutParams3.weight = 0.257f;
        layout3.setLayoutParams(layoutParams3);
    }
}
