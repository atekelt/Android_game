package com.example.falcon.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void multi(View view)
    {
        Intent multi_intent = new Intent(this, MultiPlayer.class);
        startActivity(multi_intent);
    }

    public static void single(View view)
    {

    }

    public static void setting(View view)
    {

    }

}
