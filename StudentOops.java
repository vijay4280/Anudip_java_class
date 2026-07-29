/*Assignment 1: Student Management System
Question
Create a Java program to manage student information using Classes, Objects, and Constructors.

Requirements:
Create a class named Student.
The class should contain the following attributes:
Student ID
Student Name
Course
Marks
Create a parameterized constructor to initialize all the attributes.
Create the following methods:
displayDetails() – to display all student information.
isPassed() – to check whether the student has passed or failed. (Passing marks = 40)
In the main() method:
Create three Student objects.
Display the details of all students.
Print whether each student has passed or failed.
Bonus Challenge: Display the student who has scored the highest marks. */

 public class StudentOops{
  
   static class Student {
     private int id;
     private String name;
     private String course;
     private int marks;

     Student(int id, String name, String course, int marks) {
       this.id = id;
       this.name = name;
       this.course = course;
       this.marks = marks;
     }

     void displayDetails() {
       System.out.println("ID: " + id + ", Name: " + name + ", Course: " + course + ", Marks: " + marks);
     }

     boolean isPassed() {
       return marks >= 40;
     }

     String getName() {
       return name;
     }

     int getMarks() {
       return marks;
     }
   }

   public static void main(String[] args) {
    
     // Creating three Student objects
     Student student1 = new Student(1, "Naresh", "Mathematics", 85);
     Student student2 = new Student(2, "Vijay", "Science", 35);
     Student student3 = new Student(3, "Deepak", "History", 55);

     // Displaying details of all students
     System.out.println("Student Details:");
     student1.displayDetails();
     student2.displayDetails();
     student3.displayDetails();

     // Checking if each student has passed or failed
     System.out.println("\nPass/Fail Status:");
     System.out.println(student1.getName() + ": " + (student1.isPassed() ? "Passed" : "Failed"));
     System.out.println(student2.getName() + ": " + (student2.isPassed() ? "Passed" : "Failed"));
     System.out.println(student3.getName() + ": " + (student3.isPassed() ? "Passed" : "Failed"));

     // Bonus Challenge: Finding the student with the highest marks
     Student highestScorer = student1;
     if (student2.getMarks() > highestScorer.getMarks()) {
       highestScorer = student2;
     }
     if (student3.getMarks() > highestScorer.getMarks()) {
       highestScorer = student3;
     }

     System.out.println("\nHighest Scorer:");
     highestScorer.displayDetails();
   }
 }

