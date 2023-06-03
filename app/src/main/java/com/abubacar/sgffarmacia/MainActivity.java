package com.abubacar.sgffarmacia;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.abubacar.sgffarmacia.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //setSupportActionBar(binding.appBarMain.toolbar);
        ActionBarDrawerToggle toggle;
        toggle = new ActionBarDrawerToggle(this, binding.drawerLayout, binding.appBarMain.toolbar,

                R.string.FarmaciaSGF_Open, R.string.FarmaciaSGF_close);

        binding.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        binding.navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            class home_fragment extends Fragment {
            }

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                int id = item.getItemId();

                if (id == R.id.home) {

                    transaction.replace(R.id.containers, new home_fragment());
                    transaction.commit();
                } else if (id == R.id.fav) {


                    transaction.replace(R.id.containers,new home_fragment());

                } else if (id == R.id.nav_Share) {

                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_SEND);
                    intent.putExtra(Intent.EXTRA_TEXT, "");
                    intent.setType("text/plan");
                    startActivity(intent);
                }


                return true;
            }
        });


    }

    @Override
    public void onBackPressed() {

        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    {

    }
}

