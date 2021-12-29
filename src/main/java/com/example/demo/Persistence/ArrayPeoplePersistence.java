package com.example.demo.Persistence;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Core.Ride;
import com.example.demo.Core.User;

public class ArrayPeoplePersistence implements PeoplePersistence {
    private static List<User> users = new ArrayList<User>();

    @Override
    public boolean add(User user) {
        return users.add(user);
    }

    public int getNextId() {
        return users.size();
    }

    @Override
    public User get(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public boolean delete(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return users.remove(user);
            }
        }

        return false;
    }

    @Override
    public boolean update(User u) {
        for (User user : users) {
            if (user.getName().equals(u.getName())) {
                user.setAge(u.getAge());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean login(User u) {
        for (User user : users) {
            if ( user.getPassword().equals(u.getPassword()) && user.getId() == u.getId()) {
                return true;
            }
        }
        return false;
    }
}
