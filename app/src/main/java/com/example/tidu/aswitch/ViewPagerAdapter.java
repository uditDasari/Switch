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
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
            title = "ALL";
        }
        else if (position == 1)
        {
            title = "Transportation";
        }
        else if (position == 2)
        {
            title = "Service";
        }
        else
            title="Asset";
        return title;
    }
}
