package com.bobozhu.jetpackapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavArgument;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.fragment.NavHostFragment;

/**
 * 功能描述：
 *
 * @author BoBoZhu
 * @date 2019/3/4 0004
 */
public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_tab);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.frag_nav_simple);
        NavGraph navSimple = navHostFragment.getNavController().getNavInflater().inflate(R.navigation.mynav);
//        NavDestination firstFragDestination = navSimple.findNode(R.id.mynav);
//        FirstFragmentArgs fragmentArgs = new FirstFragmentArgs.Builder("给 First 的数据").build();
//        firstFragDestination.setDefaultArguments(fragmentArgs.toBundle());
        NavDestination node = navSimple.findNode(R.id.tabFragment);
        Bundle bundle = new Bundle();
        bundle.putString("data1", "this is a demo");
        NavArgument navArgument = new NavArgument.Builder()
                .setDefaultValue(bundle).build();

        node.addArgument("data", navArgument);
        navHostFragment.getNavController().setGraph(navSimple);

    }
}
