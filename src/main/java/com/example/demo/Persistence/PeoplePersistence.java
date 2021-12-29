package com.example.demo.Persistence;

import java.util.List;

import com.example.demo.Core.Person;
public interface PeoplePersistence {

    public int getNextId();

    boolean add(Person person);

    Person get(String name);

    List<Person> getAll();

    boolean delete(String name);

}
