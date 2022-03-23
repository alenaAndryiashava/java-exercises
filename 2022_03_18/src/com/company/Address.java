package com.company;
//  2.create two classes: Address with the fields street and houseNumber, constructor etc.

public class Address {
    private String street;
    private int houseNumber;

    public Address(String street, int houseNumber){
        this.street = street;
        this.houseNumber=houseNumber;
    }

    public String toString() {
        return "Address: " +
                "street: " + street +
                "  houseNumber: " + houseNumber;

    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

}


