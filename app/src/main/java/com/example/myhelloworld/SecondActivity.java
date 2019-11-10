package com.example.myhelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private static final String MESSAGE = "MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final String message = getIntent().getStringExtra(MESSAGE);
        TextView messagePreview = findViewById(R.id.preview_text);
        messagePreview.setText(message);

        final String[] hardcodedEmails = new String[] {"pavlushasoslow@yandex.ru"};

        final Button emlBtn = findViewById(R.id.email_btn); //why always final?
        emlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_EMAIL, hardcodedEmails);
                intent.putExtra(Intent.EXTRA_SUBJECT, "Holla!");
                intent.putExtra(Intent.EXTRA_TEXT, message);
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(intent);
                } Toast.makeText(getApplicationContext(), "there is no e-mail app", Toast.LENGTH_LONG).show();

            }
        });

    }

    public static void start(Activity activity, String message){
        Intent intent = new Intent(activity, SecondActivity.class);
        intent.putExtra(MESSAGE, message);
        activity.startActivity(intent);
    }
}
