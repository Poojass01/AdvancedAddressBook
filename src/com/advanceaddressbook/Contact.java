package com.advanceaddressbook;

public class Contact {
    String firstName, lastName, address, city, state, email;
    long phone;
    int zip;

    public Contact(String firstName, String lastName, String address, String city, String state, int zip, long phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return firstName + " " + lastName + ", " + address + ", " + city + ", " + state + " - " + zip + ", " + phone + ", " + email;
    }
}
