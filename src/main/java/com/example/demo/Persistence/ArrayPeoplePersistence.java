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
    public Passenger get(int id) {
        for (Passenger P : passengers) {
            if (P.getId() == id) {
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
                user.getMobileNum().equals(P.getMobileNum());
                user.getEmail().equals(P.getEmail());
                user.getPassword().equals(P.getPassword());
                user.setId(P.getId());
                user.getRideHistory().equals(P.getRideHistory());
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
