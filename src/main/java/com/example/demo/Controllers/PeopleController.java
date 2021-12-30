package com.example.demo.Controllers;

import java.util.List;
import com.example.demo.application.IPeopleService;
import com.example.demo.application.PeopleService;
import com.example.demo.observers.Passenger;

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

    @GetMapping("/passenger/{name}")
    public Passenger get(@PathVariable String name) {
        return peopleService.get(name);
    }

    @PostMapping("/passenger")
    public boolean add(@RequestBody Passenger P) {
        return peopleService.add(P);
    }

    @PutMapping("/passenger")
    public boolean update(@RequestBody Passenger P) {
        return peopleService.update(P);
    }

    @DeleteMapping("/passenger/{name}/delete")
    public boolean update(@PathVariable String name) {
        return peopleService.delete(name);
    }

    @PostMapping("/passenger/login")
    public boolean login(@RequestBody Passenger P) {
        return peopleService.login(P);
    }

}