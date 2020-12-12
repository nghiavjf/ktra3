package com.nghia.pvn.kiemtra3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class pager_PhoBien extends Fragment {

    private View view329;
    private GridView grid329;
    String[] title =
            {
                   "Cà phê Lúa Mạch đá",
                    "Cà phê Lúa Mạch nóng",
                    "Socôla Lúa Mạch đá xay",
                    "Socôla Lúa Mạch nóng",
                    "Macca Phủu sôcôla",
            };
    String[] tv =
            {
                    "69.000 đ",
                    "69.000 đ",
                    "69.000 đ",
                    "69.000 đ",
                    "45.000 đ",
            };
    Integer[] imageId =
            {
                    R.drawable.pb1,
                    R.drawable.pb2,
                    R.drawable.pb3,
                    R.drawable.pb4,
                    R.drawable.pb5,
            };
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view329=inflater.inflate(R.layout.pager_phobien,container,false);

        CustomGrid adapter = new CustomGrid(getActivity(), title, tv, imageId);
        grid329 =  view329.findViewById(R.id.grid1);
        grid329.setAdapter(adapter);



        return view329;
    }
}
