package ru.geekbrains.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        ComparatorByName byName = new ComparatorByName();
        ComparatorByAge byAge = new ComparatorByAge();
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Worker("Иван", "Петров", 29, 30_000));
        employeeList.add(new Worker("Николай", "Анищенко", 43, 30_000));
        employeeList.add(new Worker("Алексей", "Григорьев", 25, 30_000));
        employeeList.add(new Freelancer("Максим", "Тимофеев", 21, 3_000));
        employeeList.add(new Freelancer("Алла", "Гришкевич", 19, 4_000));
        employeeList.add(new Freelancer("Владимир", "Андронов", 32, 5_000));

        System.out.println("До сортировки: ");
        employeeList.forEach(System.out::println);

        System.out.println("\nПосле сортировки по имени: ");
        employeeList.sort(byName);
        employeeList.forEach(System.out::println);

        System.out.println("\nПосле сортировки по возрасту: ");
        employeeList.sort(byAge);
        employeeList.forEach(System.out::println);
    }
}
