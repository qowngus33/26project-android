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

public class ContentActivity20 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private Button backButton;
    private Button nextButton;
    private Button P_button;
    private Button J_button;
    private int [] list;
    private int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main20);
        list = getIntent().getIntArrayExtra("list");

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        backButton = findViewById(R.id.back);
        nextButton = findViewById(R.id.next);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ContentActivity19.class);
                intent.putExtra("list",list);
                startActivity(intent);
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                list[3]+=value;
                String result = "";
                if(list[0]>0)
                    result += "e";
                else
                    result += "i";
                if(list[1]>0)
                    result += "s";
                else
                    result += "n";
                if(list[2]>0)
                    result += "t";
                else
                    result += "f";
                if(list[3]>0)
                    result += "j";
                else
                    result += "p";
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });

        P_button = findViewById(R.id.P_button);
        J_button = findViewById(R.id.J_button);

        J_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                J_button.setBackgroundColor(Color.parseColor("#D3D3D3"));
                P_button.setBackgroundColor(Color.parseColor("#FFFFFF"));
                value=1;
            }
        });
        P_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                P_button.setBackgroundColor(Color.parseColor("#D3D3D3"));
                J_button.setBackgroundColor(Color.parseColor("#FFFFFF"));
                value=-1;
            }
        });
    }
}