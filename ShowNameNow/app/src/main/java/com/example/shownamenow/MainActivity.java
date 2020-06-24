package com.example.shownamenow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button myButton;
    private TextView showText;
    private EditText enterName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterName = findViewById(R.id.editTextTextPersonName);
        myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = enterName.getText().toString();
                showText.setText("Hello " + name + "!");
            }
        });
        showText = findViewById(R.id.textView);




    }
}