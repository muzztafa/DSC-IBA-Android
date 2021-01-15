package com.example.counterappdsc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button increment;
    Button decrement;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("tag", "onCreate: created successfully ");

        increment = findViewById(R.id.increment_btn);
        decrement = findViewById(R.id.decrement_btn);
        result = findViewById(R.id.num_textView);

        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = result.getText().toString();
                int i = Integer.parseInt(temp);
                i = i + 1;
                result.setText(i+"");
            }
        });

        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = result.getText().toString();
                int i = Integer.parseInt(temp);
                i = i - 1;
                result.setText(i+"");
            }
        });
    }
}
