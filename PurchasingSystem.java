import java.util.Scanner; // Import Scanner class for user input

public class PurchasingSystem {

    public static void main(String[] args) {
        Scanner closet = new Scanner(System.in); // Create a Scanner object 'closet' for user input
        double totalCost = 0.0; // Initialize totalCost to 0.0
        displayMenu(closet, totalCost); // Call displayMenu method to show options to the user
        closet.close(); // Close the Scanner object to prevent resource leaks
    }

    public static void displayMenu(Scanner closet, double totalCost) {
        // Display the menu options
        System.out.println("Welcome to the H Clothing!");
        System.out.println("Please select an option:");
        System.out.println("1. Necklace - RM 30.00");
        System.out.println("2. Cropped Jacket - RM 150.00");
        System.out.println("3. Wide Leg Denim pants - RM 250.00");
        System.out.println("4. Checkout"); // Added Checkout option
        System.out.print("Enter your choice (1-4): "); // Updated prompt to include option 4

        int choice = closet.nextInt(); // Read user input for menu choice

        switch (choice) {
            case 1:
                totalCost += 30.00; // Add cost of Necklace to totalCost
                System.out.println("Necklace added to your cart."); // Confirm addition
                break;
            case 2:
                totalCost += 150.00; // Add cost of Cropped Jacket to totalCost
                System.out.println("Cropped Jacket added to your cart."); // Confirm addition
                break;
            case 3:
                totalCost += 250.00; // Add cost of Wide Leg Denim pants to totalCost
                System.out.println("Wide Leg Denim pants added to your cart."); // Confirm addition
                break;
            case 4:
                System.out.printf("Your total cost is: RM%.2f\n", totalCost); // Display total cost
                System.out.println("Thank you for shopping with us!"); // Thank the user
                return; // End the recursion and exit the method
            default:
                System.out.println("Invalid choice. Please select a valid option."); // Handle invalid input
                break;
                // initialise += item (everything will add until user choose checkout)
        }

        // Recursive call to display the menu again with updated totalCost
        displayMenu(closet, totalCost);
    }
}
