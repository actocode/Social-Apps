package com.example.akankshagupta.facebooklogin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {



        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.homepage);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

            /* fetching the username from LoginActivity */
            String username = getIntent().getStringExtra("username");
            TextView uname = findViewById(R.id.TV_username);
            uname.setText(username);
        }
    }
