package com.example.bmrakibul.planeshooter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartGame (View v) {
        Log.i("imageButton", "clicked");
        Intent intent = new Intent(this,StartGame.class);
        startActivity(intent);
        finish();
    }
}
