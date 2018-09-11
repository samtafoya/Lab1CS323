package com.example.sammitafoya.lab1cs323;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //THE VIEW
    private TextView countView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countView = (TextView) findViewById(R.id.greetingText);

    }

    public void changeText (View view){
        countView.setText("Goodbye");
    }

}


///Users/sammitafoya/cs323/Lab1CS323