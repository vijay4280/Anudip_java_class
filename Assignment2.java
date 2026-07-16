/*you are supposed to take input from user and create an array
1. sum of all elements
2. print the reverse array of string
e.g:  {Apple, Mango, Banana} 
output : {Banana, Mango, Apple}
3. find the largest element in array
4. sort and array in descending order */
 

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] array = new String[n];

        // Taking input for the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        
        }

        // 1. Sum of all elements (for strings, we can consider concatenation)
        StringBuilder sum = new StringBuilder();
        for (String element : array) {
            sum.append(element);
        }
        System.out.println("Concatenated string of all elements: " + sum.toString());

        // 2. Print the reverse array of strings
        System.out.println("Reversed array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        // 3. Find the largest element in the array (lexicographically)
        String largest = array[0];
        for (String element : array) {
            if (element.compareTo(largest) > 0) {
                largest = element;
            }
        }
        System.out.println("Largest element in the array: " + largest);

        // 4. Sort the array in descending order
        Arrays.sort(array, (a, b) -> b.compareTo(a));
        System.out.println("Array sorted in descending order:");
        for (String element : array) {
            System.out.println(element);
        }

        scanner.close();
    }
}
