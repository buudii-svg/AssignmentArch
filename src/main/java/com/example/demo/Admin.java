package com.example.demo;

import com.example.demo.application.IPeopleService;
import com.example.demo.application.PeopleService;
import com.example.demo.observers.Driver;

public class Admin {

    private IPeopleService peopleService = new PeopleService();


    public void listDriverPendingRegisteration()
    {
        
    }

    // public void verifyDriver() {
    //     if (peopleService.getUser() instanceof Driver) {
    //         if (((Driver) peopleService.getUser()).isPending()) {
    //             ((Driver) peopleService.getUser()).setPending(false);
    //             System.out.println("admin has accepted your registeration");
    //         }
    //     }
    // }

    // public void listDriverPendingRegisteration() {
    //     for (int i = 0; i < peopleService.getPendingReg().size(); i++) {
    //         System.out.println(peopleService.getPendingReg().get(i).getName());
    //     }
    // }
}
