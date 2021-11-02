package com.example.androidjetpack;

import android.content.Context;

public class MainActivityPresenter implements MainActivityContract.Presenter{
    // Variables
    private MainActivityContract.View view;
    private Context ctx;

    // COnstructor
    public MainActivityPresenter(MainActivityContract.View view, Context ctx) {
        this.view = view;
        this.ctx = ctx;
    }

    @Override
    public void onShowData(StudentData studentData) {
        view.showData(studentData);
    }
}
