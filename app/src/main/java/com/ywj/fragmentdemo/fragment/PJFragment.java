package com.ywj.fragmentdemo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ywj.fragmentdemo.R;


/**
 * Created by SGQ on 2017/12/1.
 * <p>
 * 派件碎片
 */

public class PJFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pj, null);

        return view;
    }
}
