package com.fmm.testebottom.createaccount;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.fmm.testebottom.R;

public class ScreenDecideCad extends AppCompatActivity {

    Button btnUser;
    Button btnPev;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_decide_cad);

        btnPev = findViewById(R.id.btnPev);
        btnUser = findViewById(R.id.btnUsuario);

        btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent user = new Intent(ScreenDecideCad.this, ScreenCadUser.class);
                startActivity(user);
            }
        });

        btnPev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pev = new Intent(ScreenDecideCad.this, ScreenCadPEV.class);
                startActivity(pev);
            }
        });
    }
}
