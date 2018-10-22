package com.example.healthtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CareProviderProblemView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_care_provider_problem_view);
    }

    public void returnToProblemsList(View view) {
        // Create an intent object containing the bridge to between the two activities
        Intent intent = new Intent(CareProviderProblemView.this, ViewProblems.class);
        // Launch the browse emotions activity
        startActivity(intent);
    }

    public void addCareProviderComment(View view) {
        // Create an intent object containing the bridge to between the two activities
        Intent intent = new Intent(CareProviderProblemView.this, AddCareProviderComment.class);
        // Launch the browse emotions activity
        startActivity(intent);
    }

}
