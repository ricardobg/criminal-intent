package com.bignerdranch.android.criminalintent;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;


public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            Log.d("CrimeFragment", "Fragmento nulo");
            fragment = new CrimeFragment();
            FragmentTransaction tran = fm.beginTransaction();
            tran.add(R.id.fragment_container, fragment);
            tran.commit();
        }
        Log.d("CrimeFragment", "Fragmento Finalizou");
    }

}
