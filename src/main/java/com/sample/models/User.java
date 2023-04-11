package com.sample.models;

public class User {

    private String name;
    private String surname;
    private String age;

    public User(String name, String surname, String age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAge() {
        return age;
    }

}
