package me.amplitudo.tabfragmentapp;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import me.amplitudo.tabfragmentapp.ui.newscreen.NewScreenFragment;
import me.amplitudo.tabfragmentapp.ui.dashboard.DashboardFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_new_screen)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

//        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                FragmentTransaction transaction;
//
//                switch (menuItem.getItemId()) {
//                    case R.id.navigation_dashboard:
//                        DashboardFragment fragment = new DashboardFragment();
//                        transaction = getSupportFragmentManager().beginTransaction();
//                        transaction.replace(R.id.fragment_container, fragment);
//                        transaction.commit();
//                        break;
//                    case R.id.navigation_new_screen:
//                        NewScreenFragment newScreenFragment = new NewScreenFragment();
//                        transaction = getSupportFragmentManager().beginTransaction();
//                        transaction.replace(R.id.fragment_container, newScreenFragment);
//                        transaction.commit();
//                        break;
//                }
//                return false;
//            }
//        });
    }

}
