package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.myapplication.databinding.ActivityMainBinding;

public class ResultActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private TextView textView;
    private ImageView description;
    private ImageView character;
    private ImageView goodFriend;
    private ImageView badFriend;
    private ConstraintLayout layout;
    private Button reButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        description = findViewById(R.id.descriptionImage);
        character = findViewById(R.id.characterImage);
        goodFriend = findViewById(R.id.goodFriendImage);
        badFriend = findViewById(R.id.badFriendImage);
        textView = findViewById(R.id.textView);
        layout = findViewById(R.id.layout);
        reButton = findViewById(R.id.shareButton);

        String result = getIntent().getStringExtra("result");

        if(result.equals("entj") || result.equals("intj") || result.equals("estj")) {
            textView.setText("테크 Tech");
            layout.setBackgroundResource(R.drawable.tech_background);
            character.setImageResource(R.drawable.tech);
            description.setImageResource(R.drawable.tech_description);
            goodFriend.setImageResource(R.drawable.jani_png);
            badFriend.setImageResource(R.drawable.tina_png);
        } else if(result.equals("esfp") || result.equals("enfp") || result.equals("enfj") || result.equals("esfj")) {
            textView.setText("소무니 somuni");
            layout.setBackgroundResource(R.drawable.somuni_background);
            character.setImageResource(R.drawable.somuni);
            description.setImageResource(R.drawable.somuni_description);
            goodFriend.setImageResource(R.drawable.bab_png);
            badFriend.setImageResource(R.drawable.tina_png);
        } else if(result.equals("isfp") || result.equals("infp") || result.equals("intp")) {
            textView.setText("자니 jani");
            layout.setBackgroundResource(R.drawable.jani_background);
            character.setImageResource(R.drawable.jani);
            description.setImageResource(R.drawable.jani_description);
            goodFriend.setImageResource(R.drawable.tech_png);
            badFriend.setImageResource(R.drawable.bab_png);
        } else if(result.equals("entp") || result.equals("estp")) {
            textView.setText("밥 bab");
            layout.setBackgroundResource(R.drawable.bab_background);
            character.setImageResource(R.drawable.bab);
            description.setImageResource(R.drawable.bab_description);
            goodFriend.setImageResource(R.drawable.somuni_png);
            badFriend.setImageResource(R.drawable.jani_png);
        } else if(result.equals("istj") || result.equals("isfj") || result.equals("infj") || result.equals("istp")) {
            textView.setText("아휴 ahu");
            layout.setBackgroundResource(R.drawable.ahu_background);
            character.setImageResource(R.drawable.ahu);
            description.setImageResource(R.drawable.ahu_description);
            goodFriend.setImageResource(R.drawable.somuni_png);
            badFriend.setImageResource(R.drawable.tech_png);
        } else  {
            textView.setText("tina 티나");
            layout.setBackgroundResource(R.drawable.tina_background);
            character.setImageResource(R.drawable.tina);
            description.setImageResource(R.drawable.tina_description);
            goodFriend.setImageResource(R.drawable.ahu_png);
            badFriend.setImageResource(R.drawable.jani_png);
        }

        reButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}