package com.example.tidu.aswitch;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        if(position==0)
            fragment=new AllFragment();
        else
            fragment=new restFragment();
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
