package com.projects.comercialcarlos.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;
import com.projects.comercialcarlos.R;
import com.projects.comercialcarlos.databinding.ActivityMainBinding;
import com.projects.comercialcarlos.databinding.ToolbarBinding;
import com.projects.comercialcarlos.fragment.MenuFragment;
import com.projects.comercialcarlos.service.FragmentService;
import com.projects.comercialcarlos.usuarios.BandejaFragment;
import com.projects.comercialcarlos.util.Constantes;

public class MainActivity extends AppCompatActivity implements FragmentService {


    private ActivityMainBinding binding;
    protected String currentTag;
    private String activityTitle;
    private Handler mHandler;
    private ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar.toolbarMenu);

        currentTag = Constantes.TAG_HOME;
        mHandler = new Handler();

        if (savedInstanceState == null) {
            activityTitle = getString(R.string.app_title_bar);
            currentTag = Constantes.TAG_HOME;
            cargarHomeFragment();
        }
    }
    private void cargarHomeFragment() {
        if (getSupportFragmentManager().findFragmentByTag(currentTag) != null) {
            binding.drawerLayout.closeDrawers();
        }

        Runnable mPendingRunnable = new Runnable() {
            @Override
            public void run() {
                Fragment fragment = getHomeFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,
                        android.R.anim.fade_out);
                fragmentTransaction.replace(R.id.main_fragment_placeholder, fragment, currentTag).addToBackStack(null);
                fragmentTransaction.commitAllowingStateLoss();
            }
        };

        mHandler.post(mPendingRunnable);
        binding.drawerLayout.closeDrawers();
        invalidateOptionsMenu();
    }

    private Fragment getHomeFragment() {
        return new MenuFragment();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void verMenuInicial(Bundle bundle) {
        MenuFragment showFragment = MenuFragment.newInstance(bundle);
        showFragment(showFragment);
        this.navigationViewToolBar_setVisibility(false);
    }

    @Override
    public void verBandejaFragment() {
        BandejaFragment showFragment = BandejaFragment.newInstance();
        showFragment(showFragment);
        this.initToolbarHomeBandeja();
        navigationViewToolBar_setVisibility(true);
        this.initNavigationToolBar();
    }

    private void showFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment_placeholder, fragment)
                .addToBackStack(null);
        ft.commit();
    }

    private void initToolbarHomeBandeja() {
        binding.toolbar.toolbarMenu.setNavigationIcon(R.drawable.ic_menu);
        actionBar = getSupportActionBar();
    }

    public void navigationViewToolBar_setVisibility(Boolean var) {
        actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setHomeButtonEnabled(var);
        actionBar.setDisplayHomeAsUpEnabled(var);
        actionBar.setDisplayShowHomeEnabled(var);
    }

    private void initNavigationToolBar() {
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                binding.drawerLayout,
                binding.toolbar.toolbarMenu,
                R.string.openDrawer,
                R.string.closeDrawer
        ) {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };

        binding.drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        binding.navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                binding.drawerLayout.closeDrawers();
                displayView(menuItem.getItemId());
                return true;
            }
        });

    }


    public ToolbarBinding getToolbar() {
        return binding.toolbar;
    }


    private void displayView(int viewId) {
        Bundle bundle = new Bundle();
        switch (viewId) {
            case R.id.nav_registro:
                break;
            case R.id.nav_registroPasajeros:
                break;
            case R.id.nav_tipocontrol:
                break;
            case R.id.nav_sign_out:
                this.verMenuInicial(bundle);
                break;
        }
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

    public void iniViewToolBarMenu(String titulo) {
        binding.toolbar.imgSunat.setImageResource(R.drawable.ic_back_big);
        binding.toolbar.imgSunat.setVisibility(View.GONE);
        binding.toolbar.textTitle.setVisibility(View.VISIBLE);
        binding.toolbar.textTitle.setText(titulo);
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