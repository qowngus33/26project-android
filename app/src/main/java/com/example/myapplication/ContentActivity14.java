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

public class ContentActivity14 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private Button backButton;
    private Button nextButton;
    private Button T_button;
    private Button F_button;
    private int [] list;
    private int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main14);
        list = getIntent().getIntArrayExtra("list");

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        backButton = findViewById(R.id.back);
        nextButton = findViewById(R.id.next);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ContentActivity13.class);
                intent.putExtra("list",list);
                startActivity(intent);
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ContentActivity15.class);
                list[2]+=value;
                intent.putExtra("list", list);
                startActivity(intent);
            }
        });

        T_button = findViewById(R.id.T_button);
        F_button = findViewById(R.id.F_button);

        T_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T_button.setBackgroundColor(Color.parseColor("#D3D3D3"));
                F_button.setBackgroundColor(Color.parseColor("#FFFFFF"));
                value=1;
            }
        });
        F_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                F_button.setBackgroundColor(Color.parseColor("#D3D3D3"));
                T_button.setBackgroundColor(Color.parseColor("#FFFFFF"));
                value=-1;
            }
        });
    }
}