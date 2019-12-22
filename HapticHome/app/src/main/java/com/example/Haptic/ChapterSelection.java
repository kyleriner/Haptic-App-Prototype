package com.example.Haptic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChapterSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_selection);
    }


    public void goTo(View view) {
        Intent intent = new Intent(this, Music_Player1.class);
        startActivity(intent);
    }
}
