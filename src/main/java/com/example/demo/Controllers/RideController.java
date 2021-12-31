package com.example.demo.Controllers;

import java.util.List;

import com.example.demo.Offer;
import com.example.demo.Core.Ride;
import com.example.demo.application.IRidesService;
import com.example.demo.application.RidesService;
import com.example.demo.observers.Driver;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RideController {
    private IRidesService service = new RidesService();

    @PostMapping("/rides/add")
    public Boolean add(@RequestBody Ride ride) {
        return service.add(ride);
    }

    @GetMapping("/rides")
    public List<Ride> getAll() {
        return service.getAll();
    }

    @GetMapping("/rides/{id}")
    public Ride get(@PathVariable int id) {
        return service.get(id);
    }

    @PutMapping("/rides/ridesHistory/{id}/addRate")
    public boolean addRate(@RequestBody Ride r) {
        return service.addRate(r);
    }

    @DeleteMapping("/rides/{id}/delete")
    public boolean delete(@PathVariable int id) {
        return service.delete(id);
    }

    @GetMapping("/rides/ridesHistory/{userId}")
    public List<Ride> getRideHistory(@PathVariable int userId) {
        return service.getRideHistory(userId);
    }

    @PostMapping("/rides/requestRide")
    public boolean requestRide(@RequestBody Ride r) {
        return service.requestRide(r.getSource(),r.getDest(), r);
    }
    // @PostMapping("/ride/{rideId}/addOffer")
    // public boolean addOffer(@PathVariable int rideId, Offer offer, Driver d)
    // {
    //     return service.addOffer(rideId, offer, d);
    // }

    // @PostMapping("/ride/{rideId}/getOffers")
    // public List<Offer> getAllOffers(int rideId)
    // {
    //      return service.getAllOffers(rideId);
    // }
}