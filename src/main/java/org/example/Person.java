package org.example;

public class Person {

    private String firstname;
    private String lastname;
    private Integer age;
    private double height;
    private double weight;
    private String hometown;

    // Constructor 1
    public Person(String firstname, String lastname, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    // Constructor 2 (constructor chaining ile)
    public Person(String firstname, String lastname, Integer age,
                  double height, double weight, String hometown) {
        this(firstname, lastname, age); // chaining
        this.height = height;
        this.weight = weight;
        this.hometown = hometown;
    }

    // Getter metotları
    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
