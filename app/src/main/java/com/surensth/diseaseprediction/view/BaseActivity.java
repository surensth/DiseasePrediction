package com.surensth.diseaseprediction.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.surensth.diseaseprediction.R;


/**
 * Created by surensth on 2/26/16.
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected Context mContext;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResourceId());
        mContext = this;
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

    }


    protected abstract int getLayoutResourceId();

    protected void openFragmentNoHistory(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction();
        ft.replace(R.id.container,
                fragment);
        ft.commitAllowingStateLoss();
    }

    protected void openFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(null);
        transaction.replace(R.id.container, fragment);
        transaction.commitAllowingStateLoss();
    }

}
