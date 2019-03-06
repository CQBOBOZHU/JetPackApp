package com.bobozhu.jetpackapp.bottom.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.bobozhu.jetpackapp.BaseFragment;
import com.bobozhu.jetpackapp.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

/**
 * 功能描述：
 *
 * @author BoBoZhu
 * @date 2019/3/4 0004
 */
public class Btm3Fragment extends BaseFragment {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_tab2;
    }

    NavController navController;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.v("===","onActivityCreated");
        final View view = getView();

        view.findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_tabFragment_to_tab1Fragment);
            }
        });
        view.findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_tabFragment_to_tab2Fragment);
            }
        });
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.v("===","onViewCreated");
//        TextView textView = view.findViewById(R.id.tv1);
//        textView.setText(getClass().getSimpleName());
//        Bundle arguments = getArguments();
//        Bundle data = arguments.getBundle("data");
//        String data1 = data.getString("data1");
//        Log.v("====", data1);
    }


}
