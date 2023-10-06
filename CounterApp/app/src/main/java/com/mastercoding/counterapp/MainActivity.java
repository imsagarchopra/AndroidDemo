package com.mastercoding.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView_Counter,textView_Welcome;
    Button button;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_Welcome = findViewById(R.id.textView_welcome);
        textView_Counter = findViewById(R.id.textView_counter);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_Counter.setText(""+IncrementCounter());
            }
        });
    }

    public int IncrementCounter()
    {
        return ++counter;
    }
}