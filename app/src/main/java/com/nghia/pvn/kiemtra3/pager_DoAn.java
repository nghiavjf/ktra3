package com.nghia.pvn.kiemtra3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class pager_DoAn extends Fragment {
    private View view329;
    private GridView grid329;
    String[] title =
            {
                    "Macca Phủ Sôcôla",
                    "Mit Xáy",
                    "Cơm Cháy Chà Bông",

            };
    String[] tv =
            {
                    "45.000 đ",
                    "20.000 đ",
                    "35.000 đ",

            };
    Integer[] imageId =
            {
                    R.drawable.da1,
                    R.drawable.da2,
                    R.drawable.da3,

            };
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view329=inflater.inflate(R.layout.pager_doan,container,false);

        CustomGrid adapter = new CustomGrid(getActivity(), title, tv, imageId);
        grid329 =  view329.findViewById(R.id.grid3);
        grid329.setAdapter(adapter);

        return view329;
    }
}
