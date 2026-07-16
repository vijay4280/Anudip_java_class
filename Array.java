// create an array and take size and number from user and print the array
// ask user to search for an element if it exist or not , if yes the print the index of that element 
import java.util.Scanner;
public class Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];  

    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("The elements of the array are: ");
    for (int i = 0; i < size; i++) {  
      
      System.out.print(arr[i] + " ");
    }

    System.out.print("\nEnter the element to search: ");
    int searchElement = sc.nextInt();
    boolean found = false;
    int index = -1;

    for (int i = 0; i < size; i++) {
      if (arr[i] == searchElement) {
        found = true;
        index = i;
        break;
      }
    }

    if (found) {
      System.out.println("Element found at index: " + index);
    } else {
      System.out.println("Element not found in the array.");
    }

    sc.close();
  }

}
