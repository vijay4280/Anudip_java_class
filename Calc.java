// wap to java program to take two number and an opeartor as input from the user and perform the selected operation using conditional statements without switch case.
import java.util.Scanner;
public class Calc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    double num1 = sc.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = sc.nextDouble();
    System.out.print("Enter an operator (+, -, *, /, %): ");
    char operator = sc.next().charAt(0);

    double result;

    if (operator == '+') {
      result = num1 + num2;
      System.out.println(num1 + " + " + num2 + " = " + result);
    } else if (operator == '-') {
      result = num1 - num2;
      System.out.println(num1 + " - " + num2 + " = " + result);
    } else if (operator == '*') {
      result = num1 * num2;
      System.out.println(num1 + " * " + num2 + " = " + result);
    } else if (operator == '/') {
      if (num2 != 0) {
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
      } else {
        System.out.println("Error: Division by zero is not allowed.");
      }
    } else if (operator == '%') {
      if (num2 != 0) {
        result = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + result);
      } else {
        System.out.println("Error: Division by zero is not allowed.");
      }
    } else {
      System.out.println("Error: Invalid operator.");
    }

    sc.close();
   
  }
}
