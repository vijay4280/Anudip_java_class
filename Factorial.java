// wap to take a number from the user and find the factorial using for loop
import java.util.Scanner;
public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int factorial = 1;

    for (int i = 1; i <= num; i++) {
      factorial *= i;
    }

    System.out.println("Factorial of " + num + " is: " + factorial);
    sc.close();
  }
}
