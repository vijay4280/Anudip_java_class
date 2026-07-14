// reverse a number taking input from user and print the reverse number
import java.util.Scanner;
public class ReverseNo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    int reversedNum = 0;

    while (num != 0) {
      int digit = num % 10;
      reversedNum = reversedNum * 10 + digit;
      num /= 10;
    }

    System.out.println("The reverse of the number is: " + reversedNum);
    scanner.close();
  }
}
