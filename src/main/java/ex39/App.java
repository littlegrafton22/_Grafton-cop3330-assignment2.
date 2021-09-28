package ex39;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Grafton
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args)
    {
        Employee[] employees = {
                new Employee("John", "Johnson", "Manager", 20161231),
                new Employee("Tou", "Xiong", "Software Engineer", 20161005),
                new Employee("Michaela", "Michaelson", "District Manager", 20151219),
                new Employee("Jake", "Jacobson", "Programmer", 00000000),
                new Employee("John", "Jackson", "Coffee Mole", 20161012),
                new Employee("Jackquelyn", "Jackson", "DBA", 00000000),
                new Employee("Sally", "Webber", "Web Developer", 20151218)
        };

// Sort the above Object Array (employees) by the employee's first name.
        java.util.Arrays.sort(employees, new java.util.Comparator<Employee>() {
            @Override
            public int compare(Employee first, Employee second) {
                return first.getName().compareTo(second.getName());
            }
        });

// Build the Header string
        String header = String.format("%-25s|  %-20s|  %-15s", "Name", "Position", "Separation Date");
// Build the Header Underline string
        String underline = String.join("", java.util.Collections.nCopies(header.length(), "-"));
        System.out.println(underline);
        System.out.println(header);
        System.out.println(underline);
// Build the table data strings
        for (Employee empl : employees) {
            System.out.printf("%-25s|  %-20s|  %-15s%n", empl.getName(),
                    empl.getDepartment(), empl.getseparationDate());
        }
        System.out.println(underline);

// Functions for getting first and last names from an Employee
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

// get List view of the Employees
        List<Employee> list = Arrays.asList(employees);

// Comparator for comparing Employees by first name then last name
        Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);

// sort employees by last name, then first name
        System.out.printf(
                "%nEmployees in ascending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);

}
static class Employee
{
    private String firstName;
    private String lastName;

    private String department;
    private double separationDate;

    // constructor
    public Employee(String firstName, String lastName,
                    String department,double separationDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = department;
        this.separationDate=separationDate;
    }

    // set firstName
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    // get firstName
    public String getFirstName()
    {
        return firstName;
    }

    // set lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    // get lastName
    public String getLastName()
    {
        return lastName;
    }

    // set department
    public void setDepartment(String department)
    {
        this.department = department;
    }

    // get department
    public String getDepartment()
    {
        return department;
    }

    public void setseparationDate(double separationDate)
    {
        this.separationDate = separationDate;
    }

    // get separationDate
    public double getseparationDate()
    {
        return separationDate;
    }

    // return Employee's first and last name combined
    public String getName()
    {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    // return a String containing the Employee's information
    @Override
    public String toString()
    {
        return String.format("%-8s %-8s %s %8.0f",
                getFirstName(), getLastName(), getDepartment(),getseparationDate());
    }
}
}