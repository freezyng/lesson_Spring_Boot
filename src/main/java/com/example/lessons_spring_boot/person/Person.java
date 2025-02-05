package com.example.lessons_spring_boot.person;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @SequenceGenerator(
            name = "sequence_person",
            sequenceName = "sequence_person",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence_person"
    )
    private Long id;
    private String name;
    private String email;
    private Integer age;

    public Person() {
    }

    public Person(Long id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }
}
