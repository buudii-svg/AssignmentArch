package com.example.demo.Controllers;

import java.util.List;

import com.example.demo.Core.User;
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

    
    @GetMapping("/people")
    public List<User> getAll() {
        return peopleService.getAll();
    }

    @GetMapping("/people/{name}")
    public User get(@PathVariable String name) {
        return peopleService.get(name);
    }

    @PostMapping("/people")
    public boolean add(@RequestBody User u) {
        return peopleService.add(u);
    }

    @PutMapping("/people")
    public boolean update(@RequestBody User u) {
        return peopleService.update(u);
    }

    @DeleteMapping("/people/{name}/delete")
    public boolean update(@PathVariable String name) {
        return peopleService.delete(name);
    }
    @PostMapping("/people/login")
    public boolean login(@RequestBody User u) {
        return peopleService.login(u);
    }

}