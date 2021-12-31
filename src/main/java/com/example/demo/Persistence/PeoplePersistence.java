package com.example.demo.Persistence;

import java.util.List;

import com.example.demo.Core.Passenger;

public interface PeoplePersistence {

    public boolean add(Passenger P);

    public Passenger get(int id);

    public List<Passenger> getAll();

    public int getNextId();

    public boolean delete(int id);

    public boolean update(Passenger P);

    public boolean login(Passenger P);

}
