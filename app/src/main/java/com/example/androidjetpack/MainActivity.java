package com.example.androidjetpack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.example.androidjetpack.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 1 : Adding Dependency

        // Step 2 : Creating layout with databinding configuration

        // Step 3 : Assigning variables to widgets

        // Step 4 : Creating the Model Class : studentData

        // Step 5 : Creating MainActivity Presenter activity in order to present data

        // Step 6 : Creating MainActivity Contract Interface

        // Step 7 : Adding the Code to Main Activity and display them into correct widgets

        // Don't Miss to like, COmment & subscribe to our channel: Master Coding to get latest
        // Coding Tutorials

        // Step 8 : Let's Run the app and see the magic of Data Binding


        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this, getApplicationContext());
        StudentData studentData = new StudentData("Student Grade", "10");
        binding.setGrader(studentData);
        binding.setPresenter(mainActivityPresenter);



    }

    @Override
    public void showData(StudentData studentData) {
        String grade = studentData.getGrade();
        Toast.makeText(this, grade, Toast.LENGTH_SHORT).show();
    }
}
