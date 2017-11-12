package com.surensth.diseaseprediction.view.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.surensth.diseaseprediction.R;
import com.surensth.diseaseprediction.view.MasterFragment;
import com.surensth.diseaseprediction.view.disease_predict.DiseasePredictFragment;

/**
 * Created by surensth on 11/12/17.
 */

public class HomeFragment extends MasterFragment implements View.OnClickListener {
    Button mPredictButton;
    Button mDiagnoseButton;


    public static Fragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mPredictButton = view.findViewById(R.id.predictButton);
        mPredictButton.setOnClickListener(this);
        mDiagnoseButton = view.findViewById(R.id.diagnoseButton);
        mDiagnoseButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.predictButton:
                openFragment(DiseasePredictFragment.newInstance());
                break;
            case R.id.diagnoseButton:
                Toast.makeText(mContext, "Diagnose feature will be provided soon.", Toast.LENGTH_LONG).show();
        }
    }
}
