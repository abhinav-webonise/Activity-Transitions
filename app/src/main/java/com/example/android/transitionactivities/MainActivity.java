package com.example.android.transitionactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnActivity1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActivity1 = (Button) findViewById(R.id.button1);

        goToActivity1();
    }

    private void goToActivity1() {
        btnActivity1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(i);
    }
}
