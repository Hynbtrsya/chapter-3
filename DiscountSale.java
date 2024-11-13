package discountseason; // Package declaration

import java.util.Scanner; // Import the Scanner class for reading user input

public class DiscountSale {

    public static void main(String[] args) {
        // Create a Scanner object named 'colour' to read input from the user
        Scanner colour = new Scanner(System.in);
        
        // Prompt the user to enter the item name
        System.out.print("Enter item name: ");
        // Read the item name input from the user and store it in 'itemName'
        String itemName = colour.nextLine();
        
        // Prompt the user to enter the price per item
        System.out.print("Enter price per item:RM ");
        // Read the price input from the user and store it in 'price'
        double price = colour.nextDouble();
        
        // Prompt the user to enter the quantity of items
        System.out.print("Enter quantity: ");
        // Read the quantity input from the user and store it in 'quantity'
        int quantity = colour.nextInt();
        
        // Display a menu of color codes and their corresponding discount rates
        System.out.println("\nSelect a discount rate by choosing the color code:");
        System.out.println("1. Red - 10%");
        System.out.println("2. Blue - 15%");
        System.out.println("3. Green - 20%");
        System.out.println("4. Yellow - 25%");
        System.out.println("5. Black - 30%");
        
        // Prompt the user to choose a discount color code from the menu
        System.out.print("Enter your choice (1-5): ");
        // Read the user's choice of color code from the menu
        int colorChoice = colour.nextInt();
        
        // Initialize the discount rate
        double discountRate = 0.0;
        
        // Set the discount rate based on the user's choice
        switch (colorChoice) {
            case 1:
                discountRate = 10.0; // Set discount rate to 10% for Red
                break; // Exit the switch statement
            case 2:
                discountRate = 15.0; // Set discount rate to 15% for Blue
                break; // Exit the switch statement
            case 3:
                discountRate = 20.0; // Set discount rate to 20% for Green
                break; // Exit the switch statement
            case 4:
                discountRate = 25.0; // Set discount rate to 25% for Yellow
                break; // Exit the switch statement
            case 5:
                discountRate = 30.0; // Set discount rate to 30% for Black
                break; // Exit the switch statement
            default:
                // Handle invalid menu choices
                System.out.println("Invalid choice. Defaulting to no discount.");
                discountRate = 0.0; // Set discount rate to 0% if the choice is invalid
                break; // Exit the switch statement
        }
        
        // Calculate the total price before discount
        double totalPrice = price * quantity;
        
        // Calculate the discount amount based on the discount rate
        double discountAmount = totalPrice * (discountRate / 100);
        
        // Calculate the final price after applying the discount
        double finalPrice = totalPrice - discountAmount;
        
        // Display the item details and final calculations
        System.out.println("\nItem Details:");
        System.out.println("Item Name: " + itemName); // Output the item name
        System.out.println("Price per Item: RM " + price); // Output the price per item
        System.out.println("Quantity: " + quantity); // Output the quantity of items
        System.out.println("Total Price:RM " + totalPrice); // Output the total price before discount
        System.out.println("Discount Rate: " + discountRate + "%"); // Output the discount rate
        System.out.println("Price after Discount:RM " + finalPrice); // Output the final price after discount
        
        // Close the Scanner object to free up resources
        colour.close();
    }
}
