package com.example.demo.Controllers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Offer;
import com.example.demo.application.DriverService;
import com.example.demo.application.IDriverService;
import com.example.demo.observers.Driver;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {
    private IDriverService driverService = new DriverService();

    @GetMapping("/driver")
    public List<Driver> getAll() {
        return driverService.getAll();
    }

    @GetMapping("/driver/{id}")
    public Driver get(@PathVariable int id) {
        return driverService.get(id);
    }

    @PostMapping("/driver")
    public boolean add(@RequestBody Driver d) {
        return driverService.add(d);
    }

    @PutMapping("/driver")
    public boolean update(@RequestBody Driver d) {
        return driverService.update(d);
    }

    @DeleteMapping("/driver/{id}/delete")
    public boolean delete(@PathVariable int id) {
        return driverService.delete(id);
    }

    @PostMapping("/driver/login")
    public boolean login(@RequestBody Driver d) {
        return driverService.login(d);
    }

    @PostMapping("/driver/{rideId}/addOffer")
    public boolean addOffer(@RequestBody Offer offer, @PathVariable int rideId) {
        return driverService.addOffer(offer, rideId);
    }

}