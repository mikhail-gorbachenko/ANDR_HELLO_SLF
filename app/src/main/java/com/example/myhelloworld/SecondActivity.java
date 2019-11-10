package com.example.myhelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String MESSAGE = "MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String message = getIntent().getStringExtra(MESSAGE);
        TextView messagePreview = findViewById(R.id.preview_text);
        messagePreview.setText(message);
    }

    public static void start(Activity activity, String message){
        Intent intent = new Intent(activity, SecondActivity.class);
        intent.putExtra(MESSAGE, message);
        activity.startActivity(intent);
    }
}
