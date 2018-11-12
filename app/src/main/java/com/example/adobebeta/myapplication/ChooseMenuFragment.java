package com.example.adobebeta.myapplication;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.adobebeta.myapplication.ChooseSlideAdapter;
import com.example.adobebeta.myapplication.R;

public class ChooseMenuFragment extends Fragment {

    private ViewPager viewpager;
    private LinearLayout liner;
    private ChooseSlideAdapter myadapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_choose_menu, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        controlPath();
    }


    private void showViewPager(ViewPager.OnPageChangeListener _menuListener) {
        viewpager = getView().findViewById(R.id.choose_view_pager);
        viewpager = getView().findViewById(R.id.choose_view_pager);
        viewpager = getView().findViewById(R.id.choose_view_pager);
        liner = getView().findViewById(R.id.choose_dot);


        myadapter = new ChooseSlideAdapter(getActivity());
        viewpager.setAdapter(myadapter);

        viewpager.addOnPageChangeListener(_menuListener);

    }

    private void controlPath() {

        ViewPager.OnPageChangeListener _menuListener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {
            }

        };
        showViewPager(_menuListener);
    }

}