package br.com.digitalhouse.ciclodevidaapp;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.wtf("LOG", "onCreate() ");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.wtf("LOG", "onStart() ");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.wtf("LOG", "onResume() ");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.wtf("LOG", "onPause() ");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.wtf("LOG", "onStop() ");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.wtf("LOG", "onDestroy() ");

    }
}
