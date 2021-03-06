package com.example.demo.Controllers;

import java.util.List;

import com.example.demo.Admin;
import com.example.demo.Core.Driver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    private Admin admin = new Admin();

    @GetMapping("/admin/pendingRegistration")
    public List<Driver> getPendingDrivers() {
        return admin.listDriverPendingRegisteration();
    }

    @PutMapping("/admin/{id}/verify")
    public boolean verify(@PathVariable int id) {
        return admin.verifyDriver(id);
    }
}