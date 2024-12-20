package org.example.data.Factory;


import org.example.data.Model.User;

//Creates user roles (Admin, Student, Teacher).
public class RoleFactory {

   public static User createUser(String role, String name) {
        switch (role.toLowerCase()) {
            case "admin":
                return new Admin(name);
            case "student":
                return new Student(name);
            case "teacher":
                return new Teacher(name);
            default:
                throw new IllegalArgumentException("Invalid role: " + role);
        }
    }

}
