package com.surensth.diseaseprediction.view.disease_predict;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.surensth.diseaseprediction.R;

/**
 * Created by surensth on 11/12/17.
 */

public class DiseasePredictFragment extends Fragment {

    public static Fragment newInstance() {
        DiseasePredictFragment fragment = new DiseasePredictFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_disease_predict, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
