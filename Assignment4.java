
/*Assignment: Restaurant Menu Management System (Java Strings)

Imagine you have been hired by a newly opened restaurant to build a simple Java program that helps the owner manage today's menu.

The restaurant owner has stored the menu as a single string containing all food items. Your task is to perform different operations on this menu using the String methods you have learned in class.

Your program should:
1. Display the complete menu.
2. Print the menu in uppercase and then in lowercase.
3. Add a new food item (Fries) to the end of the menu.
4. Find the position of the food item Pasta in the menu.
5. Replace Burger with Wrap.
6. Extract only the word Sandwich from the menu.
7. Display the first five characters of the menu.
8. Split the menu into individual food items and print each item on a new line.

9. Compare the strings "Pizza" and "pizza" using:

==
equals()
equalsIgnoreCase()


10. Compare "Pizza" and "Pasta" using compareTo() and explain the result.
11. Convert the integer value 299 (Today's Special Price) into a String using String.valueOf() and display it with a proper message.
12. Count and display the total number of food items available in the menu.
13. Ask the user to enter the name of a food item and check whether it is available in the menu using contains(). Display an appropriate message based on the result.
14. Finally, display the updated menu after all the modifications.
 */
import java.util.Scanner;

public class Assignment4 {
  public static void main(String[] args) {
    String menu = "Burger, Pizza, Pasta, Sandwich, Salad";
    System.out.println("Complete Menu: " + menu);

    // Uppercase and Lowercase
    System.out.println("Menu in Uppercase: " + menu.toUpperCase());
    System.out.println("Menu in Lowercase: " + menu.toLowerCase());

    // Add new food item
    menu += ", Fries";
    System.out.println("Updated Menu after adding Fries: " + menu);

    // Find position of Pasta
    int pastaIndex = menu.indexOf("Pasta");
    System.out.println("Position of Pasta in the menu: " + pastaIndex);

    // Replace Burger with Wrap
    menu = menu.replace("Burger", "Wrap");
    System.out.println("Updated Menu after replacing Burger with Wrap: " + menu);

    // Extract Sandwich
    String sandwich = menu.substring(menu.indexOf("Sandwich"), menu.indexOf("Sandwich") + "Sandwich".length());
    System.out.println("Extracted Food Item: " + sandwich);

    // First five characters
    String firstFiveChars = menu.substring(0, 5);
    System.out.println("First five characters of the menu: " + firstFiveChars);

    // Split and print each item on a new line
    String[] foodItems = menu.split(", ");
    System.out.println("Individual Food Items:");
    for (String item : foodItems) {
      System.out.println(item);
    }

    // Compare strings
    String str1 = "Pizza";
    String str2 = "pizza";

    System.out.println("\"Pizza\" == \"pizza\": " + (str1 == str2));
    System.out.println("\"Pizza\".equals(\"pizza\"): " + str1.equals(str2));
    System.out.println("\"Pizza\".equalsIgnoreCase(\"pizza\"): " + str1.equalsIgnoreCase(str2));

    // Compare Pizza and Pasta using compareTo()
    String str3 = "Pasta";
    int comparisonResult = str1.compareTo(str3);
    System.out.println("\"Pizza\".compareTo(\"Pasta\"): " + comparisonResult);

    // Convert integer to String
    int todaysSpecialPrice = 299;
    String priceString = String.valueOf(todaysSpecialPrice);
    System.out.println("Today's Special Price: " + priceString);

    // Count total number of food items
    int totalItems = foodItems.length;
    System.out.println("Total number of food items in the menu: " + totalItems);

    // Check if a food item is available
    Scanner scanner = new java.util.Scanner(System.in);

    System.out.print("Enter a food item to check availability: ");
    String userInput = scanner.nextLine();
    if (menu.contains(userInput)) {
      System.out.println(userInput + " is available in the menu.");
    } else {
      System.out.println(userInput + " is not available in the menu.");
    }

    // Display the final updated menu
    System.out.println("Final Updated Menu: " + menu);
    scanner.close();

  }
}
