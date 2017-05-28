package com.example.hellooworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class HelloWorldActivity extends AppCompatActivity {
    private static final String TAG = "HelloWorldActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
        Log.d("HelloWorldActivity","onCreatutee exec");
        Log.v(TAG,"456");


    }
}
