package com.bobozhu.jetpackapp;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * 功能描述：
 *
 * @author BoBoZhu
 * @date 2019/3/4 0004
 */
public class MyLifeObserver implements LifecycleObserver {

    public  final String TAG=getClass().getSimpleName();

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public void onAny(){
        Log.v(TAG,"onAny");
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(){
        Log.v(TAG,"onCreate");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(){
        Log.v(TAG,"onStart");

    }



    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public  void onResume(){
        Log.v(TAG,"onResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(){
        Log.v(TAG,"onPause");
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(){
        Log.v(TAG,"onStop");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(){
        Log.v(TAG,"onDestroy");
    }


}
