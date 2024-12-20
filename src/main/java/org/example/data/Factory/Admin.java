package org.example.data.Factory;

import org.example.data.Model.User;

public class Admin extends User {


    public Admin(String name) {
        this.name = name;
        this.role = "Admin";
    }

    @Override
    public void displayRoleInfo() {
        System.out.println(name + " is an Admin. Has full access to the system.");
    }

}
