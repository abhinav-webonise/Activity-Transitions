package com.example.android.transitionactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button btnActivity2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnActivity2 = (Button) findViewById(R.id.button2);
        backToActivity1();
    }

    private void backToActivity1() {
        btnActivity2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(i);
    }
}
