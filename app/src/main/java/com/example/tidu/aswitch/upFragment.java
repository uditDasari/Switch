package com.example.tidu.aswitch;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class upFragment extends Fragment {

    TabLayout tabLayout;
    DisplayMetrics displaymetrics ;
    ViewPagerAdapter pagerAdapter;
    ViewPager viewPager;



    public upFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_up, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
       // super.onViewCreated(view, savedInstanceState);
        tabLayout=getView().findViewById(R.id.tabs);
        viewPager=getView().findViewById(R.id.view_pager_id);
        pagerAdapter=new ViewPagerAdapter(getFragmentManager());
        viewPager.setAdapter(pagerAdapter);
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
