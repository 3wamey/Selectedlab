package org.example.data.Model;


public  abstract  class User {


    protected String name;
    protected String role;

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public abstract void displayRoleInfo();


}
