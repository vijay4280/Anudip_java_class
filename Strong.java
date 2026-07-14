// strong number take input from user and check whether the number is strong or not
import java.util.Scanner;
public class Strong {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    int originalNum = num;
    int sumOfFactorials = 0;

    while (num != 0) {
      int digit = num % 10;
      int factorial = 1;

      for (int i = 1; i <= digit; i++) {
        factorial *= i;
      }

      sumOfFactorials += factorial;
      num /= 10;
    }

    if (originalNum == sumOfFactorials) {
      System.out.println(originalNum + " is a strong number.");
    } else {
      System.out.println(originalNum + " is not a strong number.");
    }
    scanner.close();
  }
}
