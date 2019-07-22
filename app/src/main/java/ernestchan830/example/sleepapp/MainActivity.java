package ernestchan830.example.sleepapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        //set the welcome page
        //getSupportFragmentManager().beginTransaction().replace(R.id.gmopmeopmoge,
        //        new dhdrjtj()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            selectedFragment = new HomeTab();
                            break;
                        case R.id.nav_statistics:
                            selectedFragment = new StatsTab();
                            break;
                        case R.id.nav_sleep:
                            selectedFragment = new SleepTab();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.icon_container,
                            selectedFragment).commit();

                    return true;
                }
            };
}
