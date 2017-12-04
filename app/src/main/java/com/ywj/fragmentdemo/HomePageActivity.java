package com.ywj.fragmentdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import com.ywj.fragmentdemo.fragment.HPFragment;
import com.ywj.fragmentdemo.fragment.LJFragment;
import com.ywj.fragmentdemo.fragment.PJFragment;
import com.ywj.fragmentdemo.fragment.SetFragment;
import com.ywj.fragmentdemo.fragment.TJFragment;
import com.ywj.fragmentdemo.nopreloadviewpager.CustomFragmentPagerAdapter;
import com.ywj.fragmentdemo.nopreloadviewpager.NoPreloadViewPager;

import java.util.ArrayList;
import java.util.List;


public class HomePageActivity extends AppCompatActivity implements NoPreloadViewPager.OnPageChangeListener, CompoundButton.OnCheckedChangeListener {


    LinearLayout activityHomePage;
    private List<Fragment> fragmentList = new ArrayList<Fragment>();
    CustomFragmentPagerAdapter ccadapter;
    private int currIndex = 0;
    private long mExitTime;
    private NoPreloadViewPager noViewpager;
    private RadioButton rbPaijian;
    private RadioButton rbLianjian;
    private RadioButton rbHomepage;
    private RadioButton rbSet;
    private RadioButton rbTongji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        initView();
        initPager();
        onClicks();

    }

    private void initView() {
        noViewpager = (NoPreloadViewPager) findViewById(R.id.no_viewpager);
        rbPaijian = (RadioButton) findViewById(R.id.rb_paijian);
        rbLianjian = (RadioButton) findViewById(R.id.rb_lianjian);
        rbHomepage = (RadioButton) findViewById(R.id.rb_homepage);
        rbSet = (RadioButton) findViewById(R.id.rb_set);
        rbTongji = (RadioButton) findViewById(R.id.rb_tongji);
        activityHomePage= (LinearLayout) findViewById(R.id.activity_home_page);
    }

    private void initPager() {
        fragmentList.add(new PJFragment());
        fragmentList.add(new LJFragment());
        fragmentList.add(new HPFragment());
        fragmentList.add(new TJFragment());
        fragmentList.add(new SetFragment());
        ccadapter = new CustomFragmentPagerAdapter(getSupportFragmentManager(), fragmentList);
        noViewpager.setAdapter(ccadapter);
        // 设置默认打开第1页
        noViewpager.setCurrentItem(2);

    }

    private void onClicks() {
        rbPaijian.setOnCheckedChangeListener(this);
        rbLianjian.setOnCheckedChangeListener(this);
        rbHomepage.setOnCheckedChangeListener(this);
        rbTongji.setOnCheckedChangeListener(this);
        rbSet.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (rbPaijian.isChecked()) {
            noViewpager.setCurrentItem(0);
        } else if (rbLianjian.isChecked()) {
            noViewpager.setCurrentItem(1);
        } else if (rbHomepage.isChecked()) {
            noViewpager.setCurrentItem(2);
        } else if (rbTongji.isChecked()) {
            noViewpager.setCurrentItem(3);
        } else if (rbSet.isChecked()) {
            noViewpager.setCurrentItem(4);
        }

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {


    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                if (currIndex == 1) {
                    rbPaijian.setChecked(true);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(false);
                } else if (currIndex == 2) {
                    rbPaijian.setChecked(true);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(false);
                } else if (currIndex == 3) {
                    rbPaijian.setChecked(true);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(false);
                } else if (currIndex == 4) {
                    rbPaijian.setChecked(true);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(false);
                }
                else if (currIndex == 5) {
                    rbPaijian.setChecked(true);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(false);
                }
                break;
            case 1:
                if (currIndex == 0) {// 从页卡1跳转转到页卡2
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(true);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(false);
                } else if (currIndex == 2) {// 从页卡1跳转转到页卡3
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(true);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(false);
                } else if (currIndex == 3) {// 从页卡1跳转转到页卡3
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(true);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(false);
                } else if (currIndex == 4) {// 从页卡1跳转转到页卡3
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(true);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(false);
                }
                else if (currIndex == 5) {// 从页卡1跳转转到页卡3
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(true);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(false);
                }
                break;
            case 2:
                if (currIndex == 0) {// 从页卡1跳转转到页卡2
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(true);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(false);
                } else if (currIndex == 1) {// 从页卡1跳转转到页卡3
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(true);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(false);
                } else if (currIndex == 3) {// 从页卡1跳转转到页卡3
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(true);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(false);
                } else if (currIndex == 4) {// 从页卡1跳转转到页卡3
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(true);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(false);
                }
                else if (currIndex == 5) {// 从页卡1跳转转到页卡3
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(true);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(false);
                }
                break;
            case 3:
                if (currIndex == 0) {
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(true);
                    rbSet.setChecked(false);
                } else if (currIndex == 1) {
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(true);
                    rbSet.setChecked(false);
                } else if (currIndex == 2) {// 从
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(true);
                    rbSet.setChecked(false);
                } else if (currIndex == 4) {// 从
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(true);
                    rbSet.setChecked(false);
                }
                else if (currIndex == 5) {// 从
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(true);
                    rbSet.setChecked(false);
                }
                break;
            case 4:
                if (currIndex == 0) {
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(true);
                } else if (currIndex == 1) {
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(true);
                } else if (currIndex == 2) {
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(true);
                } else if (currIndex == 3) {
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(true);
                }
                else if (currIndex == 4) {
                    rbPaijian.setChecked(false);
                    rbLianjian.setChecked(false);
                    rbHomepage.setChecked(false);
                    rbTongji.setChecked(false);
                    rbSet.setChecked(true);
                }
                break;

        }
        currIndex = position;
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                mExitTime = System.currentTimeMillis();
            } else {
                finish();
            }

            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}

