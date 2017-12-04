package com.ywj.fragmentdemo.nopreloadviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class CustomFragmentPagerAdapter extends LazyFragmentPagerAdapter {

    private List<Fragment> fragments = new ArrayList<Fragment>();

    public CustomFragmentPagerAdapter(FragmentManager fragmentManager, List<Fragment> fragments) {
        super(fragmentManager);
        this.fragments = fragments;
    }

    @Override
    protected Fragment getItem(ViewGroup container, int position) {
        // TODO Auto-generated method stub
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return fragments.size();
    }

}
