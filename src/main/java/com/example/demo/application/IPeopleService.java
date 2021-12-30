package com.example.demo.application;

import java.util.List;
import com.example.demo.observers.Passenger;

public interface IPeopleService {
    boolean add(Passenger P);

    Passenger get(String name);

    List<Passenger> getAll();

    boolean delete(String name);

    boolean update(Passenger P);

    boolean login(Passenger P);
}
