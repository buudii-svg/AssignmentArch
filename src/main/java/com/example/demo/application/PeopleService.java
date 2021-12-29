package com.example.demo.application;

import java.util.List;

import com.example.demo.Core.User;
import com.example.demo.Persistence.ArrayPeoplePersistence;
import com.example.demo.Persistence.PeoplePersistence;

public class PeopleService implements IPeopleService {
    private PeoplePersistence persistence = new ArrayPeoplePersistence();

    public boolean add(User user)
    {
        user.setId(persistence.getNextId());
        return persistence.add(user);
    }

    public User get(String name)
    {
        return persistence.get(name);
    }

    public List<User> getAll()
    {
        return persistence.getAll();
    }

    public boolean delete(String name)
    {
        return persistence.delete(name);
    }

    public boolean update(User user)
    {
        return persistence.update(user);
    }

    public boolean login(User u)
    {
        return persistence.login(u);
    }
}
