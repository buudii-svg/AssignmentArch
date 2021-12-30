package com.example.demo.Controllers;

import java.util.List;

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

    @GetMapping("/driver/{name}")
    public Driver get(@PathVariable String name) {
        return driverService.get(name);
    }

    @PostMapping("/driver")
    public boolean add(@RequestBody Driver d) {
        return driverService.add(d);
    }

    @PutMapping("/driver")
    public boolean update(@RequestBody Driver d) {
        return driverService.update(d);
    }

    @DeleteMapping("/driver/{name}/delete")
    public boolean update(@PathVariable String name) {
        return driverService.delete(name);
    }

    @PostMapping("/driver/login")
    public boolean login(@RequestBody Driver d) {
        return driverService.login(d);
    }

}