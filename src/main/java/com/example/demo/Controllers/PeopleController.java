package com.example.demo.Controllers;

import java.util.List;

import com.example.demo.Core.Passenger;
import com.example.demo.application.IPeopleService;
import com.example.demo.application.PeopleService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {
    private IPeopleService peopleService = new PeopleService();

    @GetMapping("/passenger")
    public List<Passenger> getAll() {
        return peopleService.getAll();
    }

    @GetMapping("/passenger/{id}")
    public Passenger get(@PathVariable int id) {
        return peopleService.get(id);
    }

    @PostMapping("/passenger")
    public boolean add(@RequestBody Passenger P) {
        return peopleService.add(P);
    }

    @PutMapping("/passenger")
    public boolean update(@RequestBody Passenger P) {
        return peopleService.update(P);
    }

    @DeleteMapping("/passenger/{id}/delete")
    public boolean delete(@PathVariable int id) {
        return peopleService.delete(id);
    }

    @PostMapping("/passenger/login")
    public boolean login(@RequestBody Passenger P) {
        return peopleService.login(P);
    }

    

}