package com.example.androidjetpack;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class StudentData extends BaseObservable {

    // Variables:
    private String  student;
    private String grade;

    // Constructor:
    public StudentData(String student, String grade) {
        this.student = student;
        this.grade = grade;
    }

    // GETTERS &  SETTERS

    @Bindable
    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
        notifyPropertyChanged(BR.student);

    }

    @Bindable
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
        notifyPropertyChanged(BR.grade);
    }


}
