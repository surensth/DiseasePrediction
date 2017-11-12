package com.surensth.diseaseprediction.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.surensth.diseaseprediction.R;

/**
 * Created by surensth on 11/12/17.
 */
public class MasterFragment extends Fragment {

    public Context mContext;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getContext();
    }

    public void openFragment(Fragment fragment) {
        FragmentManager manager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(null);
        transaction.replace(R.id.container, fragment);
        transaction.commitAllowingStateLoss();
    }


    public void openFragmentNoHistory(Fragment fragment) {
        FragmentTransaction ft = getActivity().getSupportFragmentManager()
                .beginTransaction();
        ft.replace(R.id.container,
                fragment);
        ft.commitAllowingStateLoss();
    }
}
