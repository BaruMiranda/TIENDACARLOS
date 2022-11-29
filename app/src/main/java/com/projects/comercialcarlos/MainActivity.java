package com.projects.comercialcarlos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.projects.comercialcarlos.databinding.ActivityMainBinding;
import com.projects.comercialcarlos.service.FragmentService;

public class MainActivity extends AppCompatActivity implements FragmentService {


    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar.toolbarMenu);
    }

    private void showFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment_placeholder, fragment)
                .addToBackStack(null);
        ft.commit();
    }

    public void iniView(String titulo) {
        binding.toolbar.imgSunat.setImageResource(R.drawable.ic_back_big);
        binding.toolbar.imgSunat.setVisibility(View.VISIBLE);
        binding.toolbar.textTitle.setVisibility(View.VISIBLE);
        binding.toolbar.textTitle.setText(titulo);
        Bundle bundle = new Bundle();
        binding.toolbar.imgSunat.setOnClickListener(v -> eventBack(bundle));
    }

    public void iniView(String titulo, Bundle bundle) {
        binding.toolbar.imgSunat.setImageResource(R.drawable.ic_back_big);
        binding.toolbar.imgSunat.setVisibility(View.VISIBLE);
        binding.toolbar.textTitle.setVisibility(View.VISIBLE);
        binding.toolbar.textTitle.setText(titulo);
        binding.toolbar.imgSunat.setOnClickListener(v -> eventBack(bundle));
    }

    @Override
    public void onBackPressed() {
        Bundle bundle = new Bundle();
        this.eventBack(bundle);
    }

    void eventBack(Bundle bundle) {

        getSupportFragmentManager().executePendingTransactions();
        Fragment currentFragment = getSupportFragmentManager().findFragmentById(R.id.main_fragment_placeholder);
    }
}