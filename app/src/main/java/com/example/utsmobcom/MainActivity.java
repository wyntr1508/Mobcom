package com.example.utsmobcom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button_plus);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView)findViewById(R.id.number);
                String number= tv.getText().toString();
                int i =Integer.parseInt(number);
                int j = i+1;
                String result=Integer.toString(j);
                tv.setText(result);
            }
        });
        final Button button_minus = findViewById(R.id.button_minus);
        button_minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView)findViewById(R.id.number);
                String number= tv.getText().toString();
                int i =Integer.parseInt(number);
                int j = i-1;
                String result=Integer.toString(j);
                tv.setText(result);


            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}