package com.example.demo;

import java.util.ArrayList;

import com.example.demo.Persistence.ArrayDriverPersistence;
import com.example.demo.Persistence.DriverPersistence;
import com.example.demo.application.DriverService;
import com.example.demo.application.IDriverService;
import com.example.demo.application.IPeopleService;
import com.example.demo.application.PeopleService;
import com.example.demo.observers.Driver;

public class Admin {

    ArrayList<Driver> pendingRegistrations = new ArrayList<>();
    DriverPersistence dp = new ArrayDriverPersistence();

 

    public ArrayList<Driver> listDriverPendingRegisteration()
    {
        for(Driver d : dp.getAll())
        {
             if(d.isPending() == true)
             {
                 pendingRegistrations.add(d);
             }
        }
        return pendingRegistrations;
    }

    public boolean verifyDriver(int id) {
        for(Driver d : pendingRegistrations)
        {
            if(d.getId() == id)
            {
                d.setPending(false);
                pendingRegistrations.remove(d);
                return true;
            }
        }
        return false;
    }

}
