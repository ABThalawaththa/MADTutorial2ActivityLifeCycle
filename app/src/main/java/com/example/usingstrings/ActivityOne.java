package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Log.i("LifeCycle","OnCreate() invoked");

        TextView textViewMsg2 = findViewById(R.id.tvMsg2);
        textViewMsg2.setText(R.string.Msg2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifeCycle","OnStart() invoked");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i("LifeCycle","OnRestart() invoked");
    }

    protected void onResume() {
        super.onResume();
        Log.i("LifeCycle","OnResume() invoked");
    }

    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle","OnPause() invoked");
    }

    protected void onStop() {
        super.onStop();
        Log.i("LifeCycle","OnStop() invoked");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle","OnDestroy() invoked");
    }


}