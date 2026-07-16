/* 2. print the reverse array of string
e.g:  {Apple, Mango, Banana}  also take choice fruit from  */
public class Fruit {
  public static void main(String[] args) {
    String[] fruits = {"Apple", "Mango", "Banana"};
    System.out.println("Original array of fruits:");
    for (String fruit : fruits) {
      System.out.print(fruit + " ");
    }

    System.out.println("\nReversed array of fruits:");
    for (int i = fruits.length - 1; i >= 0; i--) {
      System.out.print(fruits[i] + " ");
    }
  }
}
  // Take fruit from user and check if it is present in the array or not
  /*import java.util.Scanner;
public class Fruit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of fruits: ");
    int n = sc.nextInt();
    String[] fruits = new String[n];
    System.out.println("Enter the fruits:");
    for (int i = 0; i < n; i++) {
      fruits[i] = sc.next();
    }
    System.out.println("Original array of fruits:");
    for (String fruit : fruits) {
      System.out.print(fruit + " ");
    }

    System.out.println("\nReversed array of fruits:");
    for (int i = fruits.length - 1; i >= 0; i--) {
      System.out.print(fruits[i] + " ");
    }
    sc.close();
  }
} */