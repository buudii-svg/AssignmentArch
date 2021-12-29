package com.example.demo.Persistence;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Core.Ride;
import com.example.demo.Core.User;

public interface PeoplePersistence {

    public boolean add(User user);

    public User get(String name);

    public List<User> getAll();

    public int getNextId();

    public boolean delete(String name);

    public boolean update(User u);


}
