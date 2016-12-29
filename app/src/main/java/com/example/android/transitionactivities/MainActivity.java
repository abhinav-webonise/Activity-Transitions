package com.example.android.transitionactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // 1 - Declare Button Type
    private Button btnActivity1;
    final String TAG = getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "the onCreate() Event called");  // Activity Life Cycle Method

        // 2 - Find View By ID
        btnActivity1 = (Button) findViewById(R.id.button1);
        // 3- Call Function
        goToActivity1();
    }

    private void goToActivity1() {
        // 4 - Set On Click Listener Event
        btnActivity1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // 5 - Intent and Start
        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(i);
    }
    // ----------------------------------------------------------------------------------
    // Life Cycle Methods
    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "thr onStart() event called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "The onResume() event called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "The onPause() event called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "the onStop() event called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "the onDestroy event was called");
    }
    //--------------------------------------------------------------------------------------
}


