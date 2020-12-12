package com.nghia.pvn.kiemtra3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class fm_dathang  extends Fragment {
    private View view329;
    private ViewPager viewPager329;
    private TabLayout tabLayout329;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view329=inflater.inflate(R.layout.dathang,container,false);
        InitView();
        return view329;
    }
    private void InitView() {
        viewPager329= (ViewPager) view329.findViewById(R.id.viewp);
        viewPager329.setAdapter(new PagerAdapter(getChildFragmentManager())) ;
        tabLayout329= (TabLayout) view329.findViewById(R.id.tab);
        tabLayout329.setupWithViewPager(viewPager329);
    }
}
