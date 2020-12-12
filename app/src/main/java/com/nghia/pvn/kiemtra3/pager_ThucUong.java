package com.nghia.pvn.kiemtra3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class pager_ThucUong extends Fragment {
    private View view329;
    private GridView grid329;
    String[] title =
            {
                    "Cà Phê Sữa Đá",
                    "Bạc Xỉu",
                    "Cà Phê Đá Xay-Lạnh",
                    "Latte Đá",
                    "Cold Brew Truyền Thống",
            };
    String[] tv =
            {
                    "32.000 đ",
                    "32.000 đ",
                    "59.000 đ",
                    "50.000 đ",
                    "45.000 đ",
            };
    Integer[] imageId =
            {
                    R.drawable.thu1,
                    R.drawable.thu2,
                    R.drawable.thu3,
                    R.drawable.thu4,
                    R.drawable.thu5,
            };
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view329=inflater.inflate(R.layout.pager_thucuong,container,false);

        CustomGrid adapter = new CustomGrid(getActivity(), title, tv, imageId);
        grid329 =  view329.findViewById(R.id.grid2);
        grid329.setAdapter(adapter);

        return view329;
    }
}
