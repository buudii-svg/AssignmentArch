package com.example.demo.Persistence;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Core.Person;
public class ArrayPeoplePersistence implements PeoplePersistence {



    private static List<Person> allPersons = new ArrayList<Person>();

    @Override
    public int getNextId() {
        return allPersons.size();
    }

    @Override
    public boolean add(Person person) {
        return allPersons.add(person);
    }

    @Override
    public Person get(String name) {
        for (Person person : allPersons) {
            if (person.getName() == name) {
                return person;
            }
        }

        return null;
    }

    @Override
    public List<Person> getAll() {
        return allPersons;
    }

    @Override
    public boolean delete(String name) {
        for (Person person : allPersons) {
            if (person.getName() == name) {
                return allPersons.remove(person);
            }
        }

        return false;
    }

}
