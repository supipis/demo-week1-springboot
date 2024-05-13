package com.example.demo.model;

public record Person(String id, String name, String gender) {}

/*
public class Person {
    //attributes
    private final String id;
    private final String name;
    private final String gender;

    public Person(
            final String id,
            final String name,
            final String gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

*/
