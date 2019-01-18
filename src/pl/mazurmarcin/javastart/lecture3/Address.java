package pl.mazurmarcin.javastart.lecture3;

public class Address {

    String city;
    String street;
    String postalCode;
    String number;

    public Address(){

    }

    public Address(String city, String street, String postalCode, String number) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
        this.number = number;
    }
}
