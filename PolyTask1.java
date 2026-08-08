import java.util.Scanner;
  
 class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method to add two decimal numbers
    public double add(double a, double b) {
        return a + b;
    }
    
    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
  }
  public class PolyTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator cal = new Calculator();
        
        // Addition of two integers
        System.out.print("Enter first integer: ");
        int int1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = scanner.nextInt();
        int sumInt = cal.add(int1, int2);
        System.out.println("Sum of two integers: " + sumInt);
        
        // Addition of two decimal numbers
        System.out.print("Enter first decimal number: ");
        double double1 = scanner.nextDouble();
        System.out.print("Enter second decimal number: ");
        double double2 = scanner.nextDouble();
        double sumDouble = cal.add(double1, double2);
        System.out.println("Sum of two decimal numbers: " + sumDouble);
        
        // Addition of three integers
        System.out.print("Enter first integer for three-number addition: ");
        int int3 = scanner.nextInt();
        System.out.print("Enter second integer for three-number addition: ");
        int int4 = scanner.nextInt();
        System.out.print("Enter third integer for three-number addition: ");
        int int5 = scanner.nextInt();
        int sumThreeInteger = cal.add(int3, int4, int5);
        System.out.println("Sum of three integers: " + sumThreeInteger);
        
        scanner.close();
    }

  }
  
    
 
   
