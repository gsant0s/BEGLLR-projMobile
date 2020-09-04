package com.fmm.testebottom;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.fmm.testebottom.createaccount.ScreenDecideCad;

public class ScreenLogin extends AppCompatActivity {

    Button btnLogin;
    TextView btnCad;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_login);

        btnCad = findViewById(R.id.newCad);
        btnLogin = findViewById(R.id.button);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(ScreenLogin.this, Home.class);
                startActivity(home);
            }
        });

        btnCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent decideCad = new Intent(ScreenLogin.this, ScreenDecideCad.class);
                startActivity(decideCad);
            }
        });
    }
}
