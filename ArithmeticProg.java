import java.util.Scanner; // Import the Scanner class for reading user input

public class ArithmeticProg {
    public static void main(String[] args) {
        // Create a Scanner object named 'scanner' to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        // Read the integer input from the user and store it in 'num1'
        int num1 = scanner.nextInt();
        
        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        // Read the integer input from the user and store it in 'num2'
        int num2 = scanner.nextInt();
        
        // Display a menu of arithmetic operations for the user to choose from
        System.out.println("Choose an arithmetic operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. increment");
         System.out.println("6. decrement");
        
        // Prompt the user to choose an operation from the menu
        System.out.print("Enter your choice (1-5): ");
        // Read the user's choice from the menu
        int choice = scanner.nextInt();
        
        // Perform the chosen operation using a switch statement
        switch (choice) {
            case 1:
                // Calculate the sum of num1 and num2
                int addition = num1 + num2;
                // Output the result of the addition
                System.out.println("Addition: " + num1 + " + " + num2 + " = " + addition);
                break; // Exit the switch statement
            
            case 2:
                // Calculate the subtraction between num1 and num2
                int subtraction = num1 - num2;
                // Output the result of the subtraction
                System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + subtraction);
                break; // Exit the switch statement
            
            case 3:
                // Calculate the multiplication of num1 and num2
                int multiplication = num1 * num2;
                // Output the result of the multiplication
                System.out.println("Multiplication: " + num1 + " x " + num2 + " = " + multiplication);
                break; // Exit the switch statement
            
            case 4:
                // Perform division and check for division by zero
                if (num2 != 0) {
                    // Calculate the quotient of num1 divided by num2
                    int division = num1 / num2;
                    // Output the result of the division
                    System.out.println("Division: " + num1 + " / " + num2 + " = " + division);
                } else {
                    // Handle the case where division by zero is attempted
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break; // Exit the switch statement
            
            case 5:
                // Increment the first integer by 1
                num1++;
                // Output the incremented value of the 1st integer
                System.out.println("Increment: first integer: " + num1);
                break; // Exit the switch statement
            
             case 6:
                // decrement the first integer by 1
                num2--;
                // Output the incremented value of the 2nd integer
                System.out.println("Decrement: first integer: " + num2);
                break; // Exit the switch statement
                
            default:
                // Handle invalid menu choices
                System.out.println("Invalid choice. Please select a number between 1 and 5.");
                break; // Exit the switch statement
        }
        
       
        
        // Close the Scanner object to free up resources
        scanner.close();
    }
}
