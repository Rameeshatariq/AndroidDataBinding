package com.example.androidjetpack;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class ScoreViewModel extends AndroidViewModel {

     // This is our view model class that will store the data and retrieve them
    public int scoreA = 10;
    public int scoreB = 0;


    public ScoreViewModel(@NonNull Application application) {
        super(application);
    }
}
