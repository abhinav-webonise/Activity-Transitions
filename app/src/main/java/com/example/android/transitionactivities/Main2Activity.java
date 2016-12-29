package com.example.android.transitionactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button btnActivity2;
    final String TAG = getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(TAG, "the onCreate() 2 Event called");
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

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "thr onStart() 2 event called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "The onResume() 2 event called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "The onPause() 2 event called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "the onStop() 2 event called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "the onDestroy() 2 event was called");
    }
}
