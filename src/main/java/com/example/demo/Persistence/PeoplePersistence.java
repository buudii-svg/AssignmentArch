package com.example.demo.Persistence;

import java.util.List;

import com.example.demo.Core.User;
public interface PeoplePersistence {

    public int getNextId();

    boolean add(User person);

    User get(String name);

    List<User> getAll();

    boolean delete(String name);

}
