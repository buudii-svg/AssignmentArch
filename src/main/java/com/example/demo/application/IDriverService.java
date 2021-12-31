package com.example.demo.application;

import java.util.List;

import com.example.demo.observers.Driver;

public interface IDriverService {
    boolean add(Driver d);

    Driver get(int id);

    List<Driver> getAll();

    boolean delete(String name);

    boolean update(Driver d);

    boolean login(Driver d);
}