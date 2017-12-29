package com.example.kishanjha.kishan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();
    }

    public void OnClickButtonListener(){
        button = (Button) findViewById(R.id.explore);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.example.kishanjha.kishan.website");
                startActivity(i);
            }
        });
    }
}
