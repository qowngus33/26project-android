package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.myapplication.databinding.ActivityMainBinding;

public class ContentActivity10 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private Button backButton;
    private Button nextButton;
    private Button S_button;
    private Button N_button;
    private int [] list;
    private int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main10);
        list = getIntent().getIntArrayExtra("list");

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        backButton = findViewById(R.id.back);
        nextButton = findViewById(R.id.next);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ContentActivity9.class);
                intent.putExtra("list",list);
                startActivity(intent);
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ContentActivity11.class);
                list[1]+=value;
                intent.putExtra("list", list);
                startActivity(intent);
            }
        });

        S_button = findViewById(R.id.S_button);
        N_button = findViewById(R.id.N_button);

        S_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                S_button.setBackgroundColor(Color.parseColor("#D3D3D3"));
                N_button.setBackgroundColor(Color.parseColor("#FFFFFF"));
                value=1;
            }
        });
        N_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                N_button.setBackgroundColor(Color.parseColor("#D3D3D3"));
                S_button.setBackgroundColor(Color.parseColor("#FFFFFF"));
                value=-1;
            }
        });
    }
}