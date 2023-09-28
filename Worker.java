package ru.geekbrains.lesson3;

public class Worker extends Employee{

    private double salary;

    public Worker(String name, String surname, int age, double salary) {
        super(name, surname, age);
        this.salary = salary;
    }

    @Override
    public double salaryMonthAverage() {
        return this.salary;
    }

    @Override
    public String toString() {
    return String.format("%s: %s %s, возраст - %d, зарплата - %.2f",getClass().getSimpleName(), getName(), getSurname(), getAge(), salaryMonthAverage());
    }
}
