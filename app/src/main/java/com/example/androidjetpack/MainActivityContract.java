package com.example.androidjetpack;

public interface MainActivityContract {

    public interface Presenter {
        void onShowData(StudentData studentData);
    }

    public interface View{
                void showData(StudentData studentData);
      }



}
