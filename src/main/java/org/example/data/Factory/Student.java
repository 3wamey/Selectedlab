package org.example.data.Factory;

import org.example.data.Model.User;

public class Student extends User {

    public Student(String name) {
        this.name = name;
        this.role = "Student";
    }

    @Override
    public void displayRoleInfo() {
        System.out.println(name + " is a Student. Can take quizzes and view results.");
    }



}
