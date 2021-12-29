package com.example.demo.application;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Core.User;

public class PeopleService implements IPeopleService {
    private static List<User> peopleRepo = new ArrayList<User>();

    @Override
    public boolean add(User user) {
        return peopleRepo.add(user);
    }

    @Override
    public User get(String name) {
        for (User user : peopleRepo) {
            if (user.getName().equals(name)) {
                return user;
            }
        }

        return null;
    }

    @Override
    public List<User> getAll() {
        return peopleRepo;
    }

    @Override
    public boolean delete(String name) {
        for (User user : peopleRepo) {
            if (user.getName().equals(name)) {
                return peopleRepo.remove(user);
            }
        }

        return false;
    }

    @Override
    public boolean update(User u) {
        for (User user : peopleRepo) {
            if (user.getName().equals(u.getName())) {
                user.setAge(u.getAge());
                return true;
            }
        }

        return false;
    }

}
