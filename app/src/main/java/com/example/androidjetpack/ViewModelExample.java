package com.example.androidjetpack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import  androidx.lifecycle.ViewModelProvider;

public class ViewModelExample extends AppCompatActivity {
    TextView textViewy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model);

        textViewy = findViewById(R.id.textViewyy);

        // Creating instance of the view model class
        ScoreViewModel model = new ViewModelProvider(this).get(ScoreViewModel.class);

        DisplayPoints(model);

    }

    private void DisplayPoints(ScoreViewModel model) {
        // Getting Number of points

        textViewy.setText(""+ model.scoreA);
       // Toast.makeText(this, "Points of A " +model.scoreA, Toast.LENGTH_SHORT).show();
    }
}
