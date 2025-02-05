package com.example.lessons_spring_boot.person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class PersonController {

    @GetMapping
    public List<Person> helloWorld() {
        return List.of(
                new Person(1L, "Vasya", "@Vasya.Vasya.www", 34),
                new Person(3L, "Sanya", "@Sanya.Sanya.www", 33)
        );
    }
}
