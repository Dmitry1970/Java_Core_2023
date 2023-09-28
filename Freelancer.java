package ru.geekbrains.lesson3;

public class Freelancer extends Employee{

    double ratePerHour;

    public Freelancer(String name, String surname, int age, double ratePerHour) {
        super(name, surname, age);
        this.ratePerHour = ratePerHour;

    }

    @Override
    public double salaryMonthAverage() {
        return 20.8 * 8 * ratePerHour;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s, возраст - %d, зарплата - %.2f", getClass().getSimpleName(), getName(), getSurname(), getAge(), salaryMonthAverage());
    }


}
