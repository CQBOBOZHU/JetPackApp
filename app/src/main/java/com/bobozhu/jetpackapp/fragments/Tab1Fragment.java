package com.bobozhu.jetpackapp.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bobozhu.jetpackapp.BaseFragment;
import com.bobozhu.jetpackapp.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * 功能描述：
 *
 * @author BoBoZhu
 * @date 2019/3/4 0004
 */
public class Tab1Fragment extends BaseFragment {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_tab1;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView=view.findViewById(R.id.tv1);
        textView.setText(getClass().getSimpleName());
    }
}
