package com.example.demo.application;

import java.util.List;

import com.example.demo.Core.Passenger;

public interface IPeopleService {
    boolean add(Passenger P);

    Passenger get(int id);

    List<Passenger> getAll();

    boolean delete(int id);

    boolean update(Passenger P);

    boolean login(Passenger P);
}
