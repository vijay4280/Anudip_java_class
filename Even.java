// take input from user for a number and find out wheather the number is even or odd
import java.util.Scanner;

public class Even {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      int num = sc.nextInt();

      if (num % 2 == 0) {
        System.out.println(num + " is an even number.");
      } else {
        System.out.println(num + " is an odd number.");
      }
    }

  }
}
