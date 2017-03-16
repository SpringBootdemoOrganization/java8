package com.zhihao.Collectors;

public class People {

    private String city;

    private String firstName;

    private String lastName;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public People(String city, String firstName, String lastName) {
        this.city = city;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
