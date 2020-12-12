package com.nghia.pvn.kiemtra3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView329;
    private ViewPager viewPager329;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView329 = findViewById(R.id.bottom_navigation);
        viewPager329 = findViewById(R.id.view_pager_main);

        setUpViewPager();
        bottomNavigationView329.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        viewPager329.setCurrentItem(0);
                        break;
                    case R.id.nav_bookmark:
                        viewPager329.setCurrentItem(1);
                        break;
                    case R.id.nav_invoice:
                        viewPager329.setCurrentItem(2);
                        break;
                    case R.id.nav_noti:
                        viewPager329.setCurrentItem(3);
                        break;
                }
                return true;
            }
        });


    }

    private void setUpViewPager() {
        ViewFagerAdapter viewFagerAdapter = new ViewFagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager329.setAdapter(viewFagerAdapter);
    }
}