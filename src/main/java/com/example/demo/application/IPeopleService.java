package com.example.demo.application;

import java.util.List;
import com.example.demo.Core.User;

public interface IPeopleService {
    boolean add(User User);

    User get(String name);

    List<User> getAll();

    boolean delete(String name);

    boolean update(User user);
}
