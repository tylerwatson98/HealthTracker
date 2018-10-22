package com.example.healthtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ViewUsers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_users);
    }

    public void Return4(View view) {
        // Create an intent object containing the bridge to between the two activities
        Intent intent = new Intent(ViewUsers.this, CareProviderHome.class);
        // Launch the browse emotions activity
        startActivity(intent);
    }
}
