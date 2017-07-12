package com.example.displayactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Moustafa.Mamdouh on 7/8/2017.
 */

public class DisplayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displauy);

        String joke = getIntent().getStringExtra(Intent.EXTRA_INTENT);
        TextView textView = (TextView) findViewById(R.id.libraryWelcomeTextView);
        textView.setText(joke);

    }
}
