/*
 * Copyright (c) 2017. M.Yoga Nugraha
 */

package com.myoganugraha.sicentang;

/**
 * Created by M. Yoga Nugraha on 8/11/2017.
 */


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class loker extends Fragment {
    public static loker newInstance() {
        loker fragment = new loker();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_loker, container, false);
    }
}
