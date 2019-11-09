package com.example.myhelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView duck;
    private Button hugBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        duck = (TextView) findViewById(R.id.duck);
        hugBtn = (Button) findViewById(R.id.hugBtn);
    }

    public void hugTheDuck(View v){
        duck.setText("QUACK! QUACK! QUACK!");
        hugBtn.setVisibility(View.GONE); //What a difference between invisible and gone?
    }
}
