package ru.geekbrains.lesson3;

public abstract class Employee {

    private String name;
    private String surname;
    private int age;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return this.age;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public abstract double salaryMonthAverage();
}
