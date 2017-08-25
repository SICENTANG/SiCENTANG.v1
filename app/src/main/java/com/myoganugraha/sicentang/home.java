/*
 * Copyright (c) 2017. M.Yoga Nugraha
 */

package com.myoganugraha.sicentang;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class home extends Fragment {
    ViewPager viewPager;
    CustomSwipeAdapter adapter;
    private Button btnHilang, btnTemu, btnLainnya;

    public static home newInstance() {
        home fragment = new home();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        btnHilang = (Button) view.findViewById(R.id.btnHilang);
        btnTemu = (Button) view.findViewById(R.id.btnTemukan);
        btnLainnya = (Button) view.findViewById(R.id.btnLaporanLain);

        adapter = new CustomSwipeAdapter(this.getActivity());
        viewPager.setAdapter(adapter);
        return view;
    }
}