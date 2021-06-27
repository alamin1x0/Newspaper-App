package com.developeralamin.newpaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem mhome,msport,mscience,mhealth,mtech,menterview;
    PageAdapter pageAdapter;
    Toolbar mtoobar;

    String api="dd027758f6d54366b29b81f29659dd05";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        mtoobar = findViewById(R.id.toolbar);
//        setSupportActionBar(mtoobar);

        mhome = findViewById(R.id.home);
        msport = findViewById(R.id.sports);
        mscience = findViewById(R.id.science);
        mhealth = findViewById(R.id.health);
        mtech = findViewById(R.id.technology);
        menterview = findViewById(R.id.enterainment);


        ViewPager viewPager = findViewById(R.id.fragmentcontainer);
        tabLayout= findViewById(R.id.include);

        pageAdapter = new PageAdapter(getSupportFragmentManager(),6);
        viewPager.setAdapter(pageAdapter);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5){
                    pageAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));




    }
}