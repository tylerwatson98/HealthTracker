package com.example.healthtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AddProblem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_problem);
    }

    public void returnFromAddProblem(View view) {
        // Create an intent object containing the bridge to between the two activities
        Intent intent = new Intent(AddProblem.this, PatientHome.class);
        // Launch the browse emotions activity
        startActivity(intent);
    }

    public void addPatientProblem(View view) {
        Toast.makeText(this, "Patient Added", Toast.LENGTH_SHORT).show();
        // Create an intent object containing the bridge to between the two activities
        Intent intent = new Intent(AddProblem.this, PatientHome.class);
        // Launch the browse emotions activity
        startActivity(intent);
    }
}
