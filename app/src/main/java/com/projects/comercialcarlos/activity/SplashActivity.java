package com.projects.comercialcarlos.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.projects.comercialcarlos.R;
import com.projects.comercialcarlos.activity.MainActivity;

public class SplashActivity extends AppCompatActivity {

    private static final long DURACION_SPLASH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new CountDownTimer(DURACION_SPLASH,1000){
            @Override
            public void onTick(long l) {

            }
            @Override
            public void onFinish() {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        }.start();

    }

}