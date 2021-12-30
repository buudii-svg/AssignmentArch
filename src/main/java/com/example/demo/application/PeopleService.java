package com.example.demo.application;

import java.util.List;

import com.example.demo.Persistence.ArrayPeoplePersistence;
import com.example.demo.Persistence.PeoplePersistence;
import com.example.demo.observers.Passenger;

public class PeopleService implements IPeopleService {
    private PeoplePersistence persistence = new ArrayPeoplePersistence();

    public boolean add(Passenger P) {
        P.setId(persistence.getNextId());
        return persistence.add(P);
    }

    public Passenger get(String name) {
        return (Passenger) persistence.get(name);
    }

    public List<Passenger> getAll() {
        return persistence.getAll();
    }

    public boolean delete(String name) {
        return persistence.delete(name);
    }

    public boolean update(Passenger P) {
        return persistence.update(P);
    }

    public boolean login(Passenger P) {
        return persistence.login(P);
    }

    // private User user;

    // public ArrayList<User> getPendingReg() {
    //     return pendingReg;
    // }

    // private ArrayList<User> pendingReg = new ArrayList<User>();

    // public void setPendingReg(User user) {
    //     pendingReg.add(user);
    // }

    // public void setUser(User user) {
    //     this.user = user;
    // }

    // public User getUser() {
    //     return user;
    // }

    // // Persistance persistance = new UserSavings();

    // public void register() {
    //     if (user instanceof Driver) {
    //         if (((Driver) user).isPending() == false) {
    //             // persistance.create(user);
    //         } else {
    //             // do nothing
    //         }
    //     } else {
    //         // persistance.create(user);
    //     }
    // }

    // public void login() {
    //     // persistance.read(user);
    // }
}
