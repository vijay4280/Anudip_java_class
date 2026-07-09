 	
/*Q1. Calculator Using Operators
Write a Java program to take two numbers and an operator (+, -, *, /, %) as input from the user and perform the selected operation using conditional statements.*/

// import java.util.Scanner;
// public class Calc {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter first number: ");
//     double num1 = sc.nextDouble();
//     System.out.print("Enter second number: ");
//     double num2 = sc.nextDouble();
//     System.out.print("Enter an operator (+, -, *, /, %): ");
//     char operator = sc.next().charAt(0);

//     double result;

//     if (operator == '+') {
//       result = num1 + num2;
//       System.out.println(num1 + " + " + num2 + " = " + result);
//     } else if (operator == '-') {
//       result = num1 - num2;
//       System.out.println(num1 + " - " + num2 + " = " + result);
//     } else if (operator == '*') {
//       result = num1 * num2;
//       System.out.println(num1 + " * " + num2 + " = " + result);
//     } else if (operator == '/') {
//       if (num2 != 0) {
//         result = num1 / num2;
//         System.out.println(num1 + " / " + num2 + " = " + result);
//       } else {
//         System.out.println("Error: Division by zero is not allowed.");
//       }
//     } else if (operator == '%') {
//       if (num2 != 0) {
//         result = num1 % num2;
//         System.out.println(num1 + " % " + num2 + " = " + result);
//       } else {
//         System.out.println("Error: Division by zero is not allowed.");
//       }
//     } else {
//       System.out.println("Error: Invalid operator.");
//     }

//     sc.close();
   
//   }
// }



/*Q2. Even or Odd Number Checker
Write a Java program to take a number from the user and check whether the number is even or odd using an if-else statement.
 */

// import java.util.Scanner;

// public class Even {
//   public static void main(String[] args) {

//     try (Scanner sc = new Scanner(System.in)) {
//       System.out.print("Enter a number: ");
//       int num = sc.nextInt();

//       if (num % 2 == 0) {
//         System.out.println(num + " is an even number.");
//       } else {
//         System.out.println(num + " is an odd number.");
//       }
//     }

//   }
// }



/*Q3. Positive, Negative, or Zero Checker
Write a Java program that takes a number as input and checks whether the number is positive, negative, or zero. */

// import java.util.Scanner;
// public class NumberCheck {
  
//   public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         double num = sc.nextDouble();

//         if (num > 0) {
//             System.out.println(num + " is a positive number.");
//         } else if (num < 0) {
//             System.out.println(num + " is a negative number.");
//         } else {
//             System.out.println("The number is zero.");
//         }
//         sc.close();
//     }
// }




/*Q4. Student Grade Calculator
Write a Java program to take marks of a student as input and display the grade according to the following conditions:

90 and above → Grade A
75 to 89 → Grade B
60 to 74 → Grade C
Below 60 → Grade D */

// import java.util.Scanner;
// public class StudentGrade {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter marks of the student: ");
//         int marks = sc.nextInt();

//         if (marks >= 90) {
//             System.out.println("Grade: A");
//         } else if (marks >= 75) {
//             System.out.println("Grade: B");
//         } else if (marks >= 60) {
//             System.out.println("Grade: C");
//         } else {
//             System.out.println("Grade: D");
//         }
//         sc.close();
//     }
// }


/*Q5. Multiplication Table Using For Loop
Write a Java program to take a number from the user and print its multiplication table from 1 to 10 using a for loop. */


// import java.util.Scanner;
// public class Table {
//   public static void main(String[] args) {
//   try (Scanner sc = new Scanner(System.in)){
//     System.out.print("Enter a number: ");
//     int num = sc.nextInt();

//     System.out.println("Multiplication table of " + num + ":");
//     for (int i = 1; i <= 10; i++) {
//       System.out.println(num + " x " + i + " = " + (num * i));
//     }
//    }
//   }
// }



/*Q6. Sum of Numbers Using While Loop
Write a Java program to take a number from the user and calculate the sum of all numbers from 1 to that number using a while loop. */

//  public class Sum {
//   public static void main(String[] args) {
//     int sum = 0;
//      for(int i = 1 ; i<=10 ; i++){
//         sum += i;
//      } 
//      System.out.println("Sum: " + sum);
//     }
//   }


/*Q7. Factorial of a Number
Write a Java program to take a number from the user and find its factorial using a for loop. */


// import java.util.Scanner;
// public class Factorial {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int num = sc.nextInt();
//     int factorial = 1;

//     for (int i = 1; i <= num; i++) {
//       factorial *= i;
//     }

//     System.out.println("Factorial of " + num + " is: " + factorial);
//     sc.close();
//   }
// }