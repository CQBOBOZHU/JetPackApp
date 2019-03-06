package com.bobozhu.jetpackapp;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavArgument;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

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

        /**
         * BottomNavigationView 控制
         */
        BottomNavigationView navigationView = findViewById(R.id.bottomNavigationView);
        NavHostFragment navHostFragment1= (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.frag_nav_simple);
        final NavController navController = navHostFragment1.getNavController();
        NavGraph inflate = navController.getNavInflater().inflate(R.navigation.bottom);
        navController.setGraph(inflate);
        NavigationUI.setupWithNavController(navigationView,navController);

        /**
         * fragment内部跳转 控制
         */
//        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.tab1:
////                        navController.navigate(R.id.action_tabActivity2_to_btm1Fragment);
//                        break;
//                    case R.id.tab2:
////                        navController.navigate(R.id.action_tabActivity2_to_btm2Fragment);
//                        break;
//                    case R.id.tab3:
////                        navController.navigate(R.id.action_tabActivity2_to_btm3Fragment);
//                        break;
//                    default:
//                }
//                return false;
//            }
//        });
//
//        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.frag_nav_simple);
//        NavGraph navSimple = navHostFragment.getNavController().getNavInflater().inflate(R.navigation.mynav);
//        NavDestination node = navSimple.findNode(R.id.tabFragment);
//        Bundle bundle = new Bundle();
//        bundle.putString("data1", "this is a demo");
//        NavArgument navArgument = new NavArgument.Builder()
//                .setDefaultValue(bundle).build();
//
//        node.addArgument("data", navArgument);
//        navHostFragment.getNavController().setGraph(navSimple);

    }
}
