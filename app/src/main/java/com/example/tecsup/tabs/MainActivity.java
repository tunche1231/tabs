package com.example.tecsup.tabs;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tableLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.view_pager);
        tableLayout.setupWithViewPager(viewPager);
        tableLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        TabAdapter tb = new TabAdapter(getSupportFragmentManager(),2);
        viewPager.setAdapter(tb);
    }
}
