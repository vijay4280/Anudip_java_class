/*
Design a Java program to demonstrate method overriding and runtime polymorphism.

Requirements

Create a parent class named Employee with the following:

Data members:
employeeId
employeeName
baseSalary

A constructor to initialize these values.

A method named calculateSalary() that displays the employee's base salary.

Create two child classes:
Manager
Developer

Override the calculateSalary() method in both child classes:

Manager:
Final Salary = Base Salary + 20% Bonus

Developer:
Final Salary = Base Salary + ₹8,000 Project Allowance

In the main() method:

Take the employee details as input from the user.
Ask the user whether the employee is a Manager or a Developer.
Create the appropriate object based on the user's choice.
Store the object in an Employee reference.
Call the calculateSalary() method and display:

Employee ID
Employee Name
Employee Role
Final Salary
*/
import java.util.Scanner;

  class Employee {
    int employeeId;
    String employeeName;
    double baseSalary;

    public Employee(int employeeId, String employeeName, double baseSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.baseSalary = baseSalary;
    }

    void calculateSalary() {
        System.out.println("Base Salary: " + baseSalary);
    }
  }

  class Manager extends Employee {
    public Manager(int employeeId, String employeeName, double baseSalary) {
        super(employeeId, employeeName, baseSalary);
    }

    @Override
    void calculateSalary() {
        double finalSalary = baseSalary + (baseSalary * 0.20);
        System.out.println("Final Salary for Manager: " + finalSalary);
    }
  }

  class Developer extends Employee {
    public Developer(int employeeId, String employeeName, double baseSalary) {
        super(employeeId, employeeName, baseSalary);
    }

    @Override
    void calculateSalary() {
        double finalSalary = baseSalary + 8000;
        System.out.println("Final Salary for Developer: " + finalSalary);
    }
  }

public class PolyTask3 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Employee ID: ");
    int employeeId = scanner.nextInt();
    scanner.nextLine(); // Consume newline
    System.out.print("Enter Employee Name: ");
    String employeeName = scanner.nextLine();
    System.out.print("Enter Base Salary: ");
    double baseSalary = scanner.nextDouble();

    System.out.print("Is the employee a Manager or Developer? (Enter 'Manager' or 'Developer'): ");
    String role = scanner.next();

    Employee employee;

    if (role.equalsIgnoreCase("Manager")) {
        employee = new Manager(employeeId, employeeName, baseSalary);
    } else if (role.equalsIgnoreCase("Developer")) {
        employee = new Developer(employeeId, employeeName, baseSalary);
    } else {
        System.out.println("Invalid role entered.");
        scanner.close();
        return;
    }

    System.out.println("\nEmployee Details:");
    System.out.println("Employee ID: " + employee.employeeId);
    System.out.println("Employee Name: " + employee.employeeName);
    System.out.println("Employee Role: " + role);
    employee.calculateSalary();

    scanner.close();
  }
}
