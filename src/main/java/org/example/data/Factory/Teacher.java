package org.example.data.Factory;

import org.example.data.Model.User;

public class Teacher extends User {

    public Teacher(String name) {
        this.name = name;
        this.role = "Teacher";
    }

    @Override
    public void displayRoleInfo() {
        System.out.println(name + " is a Teacher. Can create and grade quizzes.");
    }

}
