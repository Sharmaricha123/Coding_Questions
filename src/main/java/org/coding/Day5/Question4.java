package org.coding.Day5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question4 {

    public static void main(String args[])
    {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Ritik", "IT", 60000),
                new Employee(2, "Amit", "HR", 45000),
                new Employee(3, "Neha", "IT", 80000),
                new Employee(4, "Priya", "Finance", 70000),
                new Employee(5, "Rahul", "HR", 55000),
                new Employee(6, "Sneha", "IT", 90000),
                new Employee(7, "Ankit", "Finance", 50000)
        );

//        Sort employees by salary

        List<Employee> result=employees.stream()
                        .sorted(Comparator.comparing(Employee::getSalary))
                                .collect(Collectors.toList());


        System.out.println(result);


    }
}
