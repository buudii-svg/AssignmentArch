package com.example.demo.Persistence;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.observers.Passenger;

public class ArrayPeoplePersistence implements PeoplePersistence {
    private static List<Passenger> passengers = new ArrayList<Passenger>();

    @Override
    public boolean add(Passenger P) {
        return passengers.add(P);
    }

    public int getNextId() {
        return passengers.size();
    }

    @Override
    public Passenger get(String name) {
        for (Passenger P : passengers) {
            if (P.getName().equals(name)) {
                return P;
            }
        }
        return null;
    }

    @Override
    public List<Passenger> getAll() {
        return passengers;
    }

    @Override
    public boolean delete(int id) {
        for (Passenger P : passengers) {
            if (P.getId() == id) {
                return passengers.remove(P);
            }
        }
        return false;
    }

    @Override
    public boolean update(Passenger P) {
        for (Passenger user : passengers) {
            if (user.getName().equals(P.getName())) {
                user.setAge(P.getAge());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean login(Passenger P) {
        for (Passenger user : passengers) {
            if (user.getPassword().equals(P.getPassword()) && user.getId() == P.getId()) {
                return true;
            }
        }
        return false;
    }
}
