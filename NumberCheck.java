// wap that takes a number as input from the user and checks whether the number is positive, negative, or zero.
import java.util.Scanner;
public class NumberCheck {
  
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
        sc.close();
    }
}
