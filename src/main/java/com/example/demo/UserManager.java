package com.example.demo;

import java.util.ArrayList;

import com.example.demo.Core.User;
import com.example.demo.observers.Driver;

public class UserManager {

    private User user;

    public ArrayList<User> getPendingReg() {
        return pendingReg;
    }

    private ArrayList<User> pendingReg = new ArrayList<User>();

    public void setPendingReg(User user) {
        pendingReg.add(user);
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    // Persistance persistance = new UserSavings();

    public void register() {
        if (user instanceof Driver) {
            if (((Driver) user).isPending() == false) {
                // persistance.create(user);
            } else {
                // do nothing
            }
        } else {
            // persistance.create(user);
        }
    }

    public void login() {
        // persistance.read(user);
    }
}
