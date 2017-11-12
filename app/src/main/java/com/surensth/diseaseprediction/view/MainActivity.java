package com.surensth.diseaseprediction.view;

import android.os.Bundle;

import com.surensth.diseaseprediction.R;
import com.surensth.diseaseprediction.view.home.HomeFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        openFragmentNoHistory(HomeFragment.newInstance());
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_main;
    }
}
