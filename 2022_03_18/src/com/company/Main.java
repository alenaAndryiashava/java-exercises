package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Address address1 = new Address("Tristanstraße",15);
        Address address2 = new Address("Isoldenstraße",22);
        Person person1 = new Person("Ivanov",address1);
        Person person2 = new Person("Petrov",address2);
        Person[] persons = {person1,person2};
        AddressGetter addressGetter = new AddressGetter(persons);
        System.out.println(Arrays.toString(addressGetter.getAddresses()));
    }
}
