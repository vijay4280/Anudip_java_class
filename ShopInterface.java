/* A shopping store wants to calculate the total cost of products purchased.
Requirements:
Store the product ID, product name, price, and quantity.
Price and quantity should never be negative.
Calculate the total bill amount based on the price and quantity.
Display all product details along with the total bill. */

public class ShopInterface {
   public static void main(String[] args) {
        Product product1 = new Product(101, "Laptop", 800.0, 2);
        Product product2 = new Product(102, "Smartphone", 500.0, 3);
  
        product1.displayProductDetails();
        product2.displayProductDetails();
  
        double totalBill = product1.calculateTotal() + product2.calculateTotal();
        System.out.println("Total Bill Amount: $" + totalBill);
   } 
}

class Product {
        private int productId;
        private String productName;
        private double price;
        private int quantity;

        public Product(int productId, String productName, double price, int quantity) {
            this.productId = productId;
            this.productName = productName;
            setPrice(price);
            setQuantity(quantity);
        }

        public void setPrice(double price) {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative.");
            }
            this.price = price;
        }

        public void setQuantity(int quantity) {
            if (quantity < 0) {
                throw new IllegalArgumentException("Quantity cannot be negative.");
            }
            this.quantity = quantity;
        }

        public double calculateTotal() {
            return price * quantity;
        }

        public void displayProductDetails() {
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total: $" + calculateTotal());
            System.out.println("---------------------------");
        }
    }
