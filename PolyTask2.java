/* Question 2: Method Overriding
Employee Salary System

A company has different types of employees, and each employee's salary is calculated differently.

Create a Java program to demonstrate method overriding by implementing the following:

Create a parent class named Employee with a method called calculateSalary() that displays:

"Calculating Employee Salary..."

Create a child class named Manager that inherits from Employee and overrides the calculateSalary() method to display:

"Calculating Manager Salary with Bonus..."

Requirements:
Create an object of the Employee class and call the calculateSalary() method.
Create an object of the Manager class and call the overridden calculateSalary() method.
Create an Employee reference that points to a Manager object and call the method again.
Observe the output and identify which version of the method gets executed.
*/

    class Employee{
      void calculateSalary(){
         System.out.println("Calculating Employee Salary...");
      }
        
    }
    class Manager extends Employee {
      @Override
      void calculateSalary(){
        System.out.println("Calculating Manager Salary with Bonus...");
      }
      
    }

public class PolyTask2 {
  public static void main(String[] args) {
      
    Employee e = new Employee();
     e.calculateSalary();


       Manager mr = new Manager();
        mr.calculateSalary();


        Employee e1 = new Manager();
        e1.calculateSalary();
  }
}
