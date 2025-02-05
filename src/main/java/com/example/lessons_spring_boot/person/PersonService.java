package com.example.lessons_spring_boot.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    public List<Person> getAllPersons() {
        return List.of(
                new Person(1L, "Vasya", "@Vasya.Vasya.www", 34),
                new Person(3L, "Sanya", "@Sanya.Sanya.www", 33)
        );
    }
}
