package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button ;
    EditText name ;
    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button1);
        name =(EditText) findViewById(R.id.Name);
        textView =(TextView) findViewById(R.id.textView1);

        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                String st = name.getText().toString();
                textView.setText("Hello " + st);
            }
        });
    }

}