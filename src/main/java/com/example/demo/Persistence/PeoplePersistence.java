package com.example.demo.Persistence;

import java.util.List;
import com.example.demo.observers.Passenger;

public interface PeoplePersistence {

    public boolean add(Passenger P);

    public Passenger get(String name);

    public List<Passenger> getAll();

    public int getNextId();

    public boolean delete(String name);

    public boolean update(Passenger P);

    public boolean login(Passenger P);

}
