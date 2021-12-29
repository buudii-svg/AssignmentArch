package com.example.demo.Persistence;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Core.User;
public class ArrayPeoplePersistence implements PeoplePersistence {



    private static List<User> allUsers = new ArrayList<User>();

    @Override
    public int getNextId() {
        return allUsers.size();
    }

    @Override
    public boolean add(User user) {
        return allUsers.add(user);
    }

    @Override
    public User get(String name) {
        for (User user : allUsers) {
            if (user.getName() == name) {
                return user;
            }
        }

        return null;
    }

    @Override
    public List<User> getAll() {
        return allUsers;
    }

    @Override
    public boolean delete(String name) {
        for (User user : allUsers) {
            if (user.getName() == name) {
                return allUsers.remove(user);
            }
        }

        return false;
    }

}
