/*
Author: 20181683 임중혁
Last Modification date: 19.11.16
Function: MainActivity'
 */


package com.bungae1112.final_proj.mainActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.bungae1112.final_proj.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity
{
    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTabs();
        setViewPager();
    }

    private void setTabs()
    {
        tabLayout = findViewById(R.id.main_tabLayout_tl);
        tabLayout.addTab( tabLayout.newTab().setText("Map") );
        tabLayout.addTab( tabLayout.newTab().setText("Total List") );
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }

    private void setViewPager()
    {
        viewPager = findViewById(R.id.main_viewPager_vp);
        pagerAdapter = new PagerAdapter( getSupportFragmentManager(), tabLayout.getTabCount() );

        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout) );
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public  void  onTabUnselected(TabLayout.Tab tab)
            {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab)
            {

            }

        });
    }
}
