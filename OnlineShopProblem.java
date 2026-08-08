/*Question 3 – Online Shopping Product System
Problem Statement

An online shopping website sells different types of products.

Currently, the website sells:
Electronics
Clothing
Every product has:
Product ID [make private]
Product Name [make private]
Price [make private]
The company has decided that:
Product price should never be negative.
Every product should calculate its own discount.
Electronics receive a 10% discount.
Clothing receives a 20% discount.
The application should display:
Product Details
Original Price
Discounted Price
Task:

Create at least one Electronics product and one Clothing product, and display their details. */

public class OnlineShopProblem {
    private String productID;
    private String productName;
    private double price;

    // Constructor
    public OnlineShopProblem(String productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        setPrice(price);
    }

    // Method to set price with validation
    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Invalid Price");
            this.price = -1; // Indicate invalid price
        } else {
            this.price = price;
        }
    }

    // Method to calculate discounted price
    public double calculateDiscountedPrice() {
        return price; // Default implementation, overridden in subclasses
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        if (price == -1) {
            System.out.println("Price: Invalid");
        } else {
            System.out.println("Original Price: $" + price);
            System.out.println("Discounted Price: $" + calculateDiscountedPrice());
        }
       
    }
}

