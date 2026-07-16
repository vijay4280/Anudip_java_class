// you are supposed to take input from user and create an array
//1. sum of all elements
import java.util.Scanner;
public class Sum1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int sum = 0;
    for (int i = 0; i < size; i++) {
      sum += arr[i];
    }
    System.out.println("Sum of all elements: " + sum);
    sc.close();
  }
}
