// wap to take  a number from the user and print its multiplication table from 1 to 10 using for loop
import java.util.Scanner;
public class Table {
  public static void main(String[] args) {
  try (Scanner sc = new Scanner(System.in)){
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    System.out.println("Multiplication table of " + num + ":");
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " x " + i + " = " + (num * i));
    }
   }
  }
}
 