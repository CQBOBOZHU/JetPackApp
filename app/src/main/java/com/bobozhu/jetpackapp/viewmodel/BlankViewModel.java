package com.bobozhu.jetpackapp.viewmodel;

import com.bobozhu.jetpackapp.bean.UserBean;

import java.util.Random;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BlankViewModel extends ViewModel {

    MutableLiveData<UserBean> beanMutableLiveData = new MutableLiveData<>();


    public LiveData getUser() {
        loadUser();
        return beanMutableLiveData;
    }

    private void loadUser() {
        new Thread() {
            @Override
            public void run() {
                beanMutableLiveData.postValue(new UserBean("wangnima", 20));
            }
        }.start();
    }

    public LiveData getDatas() {
        return beanMutableLiveData;
    }

    public void updateUser() {
        loadUserNew();
    }

    private void loadUserNew() {

        new Thread() {
            @Override
            public void run() {
                Random random=new Random();
                beanMutableLiveData.postValue(new UserBean("wangnima" + random.nextInt(), random.nextInt()));
            }
        }.start();
    }
}
