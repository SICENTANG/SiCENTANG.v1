/*
 * Copyright (c) 2017. M.Yoga Nugraha
 */

package com.myoganugraha.sicentang;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class laporanHilang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan_hilang);

        getActionBar().setTitle("Kehilangan");


    }
}
