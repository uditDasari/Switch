package com.example.tidu.aswitch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class markets extends AppCompatActivity {
    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_markets);
        bottomNav = findViewById(R.id.bottomNavigation);
        bottomNav.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,
        new upFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                   Fragment fragment = null;
                   switch (menuItem.getItemId())
                   {
                       case R.id.trer:
                           fragment=new upFragment();
                           break;
                       case R.id.mon:
                           fragment=new dollarFragment();
                           break;
                       case R.id.pers:
                           fragment=new personFragment();
                           break;
                       case R.id.renew:
                           fragment=new reloadFragment();
                           break;
                   }
                   getSupportFragmentManager().beginTransaction().replace(
R.id.frameLayout,fragment
                   ).commit();
                   return true;
                }


            };
}

