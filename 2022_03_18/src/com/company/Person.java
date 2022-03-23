package com.company;

//and Person with fields name and address, constructor, getters etc.

public class Person {
    private String name;
    Address address;

    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

