package com.example.intern.tabmenu;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        try {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        }catch(NullPointerException ex){
//            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
//
//        }

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
    private void setupViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentOne(),"ONE");
        adapter.addFragment(new FragmentTwo(),"TWO");
        adapter.addFragment(new FragmentThree(),"THREE");
        viewPager.setAdapter(adapter);
    }
    public void onClickButtonFragmentOneDetail(View view){
        Intent intent = new Intent(this,DetailFragmentOne.class);
        startActivity(intent);

    }
}
