package com.company;

// create the third class AddressGetter which accepts an array
// of persons and returns an array
// of their addresses

public class AddressGetter {
    private Person[] persons;



    public AddressGetter(Person[] persons){
        this.persons = persons;

    }
    public Address[] getAddresses (){
        Address[] addresses = new Address[persons.length];
        for (int i = 0; i < persons.length ; i++) {
            addresses[i] = persons[i].getAddress();
        }
        return addresses;
    }

}

