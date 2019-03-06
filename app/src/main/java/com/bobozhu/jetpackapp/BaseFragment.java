package com.bobozhu.jetpackapp;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * 功能描述：
 *
 * @author BoBoZhu
 * @date 2019/3/4 0004
 */
public abstract class BaseFragment extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
//        getLifecycle().addObserver(new MyLifeObserver());
        Log.v("this","==="+getClass().getSimpleName()+"===onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("this","==="+getClass().getSimpleName()+"===onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.v("this","==="+getClass().getSimpleName()+"===onCreateView");
        return LayoutInflater.from(getActivity()).inflate(getLayoutId(),null);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.v("this","==="+getClass().getSimpleName()+"===onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.v("this","==="+getClass().getSimpleName()+"===onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.v("this","==="+getClass().getSimpleName()+"===onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.v("this","==="+getClass().getSimpleName()+"===onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.v("this","==="+getClass().getSimpleName()+"===onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.v("this","==="+getClass().getSimpleName()+"===onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.v("this","==="+getClass().getSimpleName()+"===onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.v("this","==="+getClass().getSimpleName()+"===onDetach");
        super.onDetach();
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        Log.v("this","==="+getClass().getSimpleName()+"===onHiddenChanged===hidden"+hidden);
        super.onHiddenChanged(hidden);
    }


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        Log.v("this","==="+getClass().getSimpleName()+"===setUserVisibleHint===isVisibleToUser"+isVisibleToUser);
        super.setUserVisibleHint(isVisibleToUser);
    }

    protected abstract int getLayoutId();
}
