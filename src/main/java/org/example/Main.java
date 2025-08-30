package org.example;


public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("Ibo", "Ygr", 15, 1.80, 75, "Ankara");

        System.out.println(person1.getFirstName() + " " + person1.getLastName() + " yaşı: " + person1.getAge());
        System.out.println("Teen mi? " + person1.isTeen());

        System.out.println(person2.getFirstName() + " " + person2.getLastName() + " yaşı: " + person2.getAge());
        System.out.println("Teen mi? " + person2.isTeen());
    }
}
