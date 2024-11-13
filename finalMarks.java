import java.util.Scanner; // Import the Scanner class for reading user input

public class finalMarks {

    public static void main(String[] args) {
        int mark; // Declare an integer variable to store the user's mark

        //  // Create a Scanner object named 'scanner' to read input from the user
        Scanner reader = new Scanner(System.in); 
                                                 
        
        System.out.print("Enter your mark: "); // Prompt the user to enter their mark
        
        // Use the 'reader' object to read the user's input as an integer and store it in the variable 'mark'
        mark = reader.nextInt(); 

        // Use if..else if statements to determine the grade based on the mark
        if (mark >= 90) { // Check if the mark is 90 or above
            System.out.println("Slay Gurl got an 'A'"); // Print grade A for marks 90 and above
        } else if (mark >= 80) { // Check if the mark is between 80 and 89
            System.out.println("Great Work 'B' for you"); // Print grade B for marks between 80 and 89
        } else if (mark >= 70) { // Check if the mark is between 70 and 79
            System.out.println("Hmm 'C' you need to improve gurl "); // Print grade C for marks between 70 and 79
        } else if (mark >= 60) { // Check if the mark is between 60 and 69
            System.out.println("a 'D' gurl what happend to you"); // Print grade D for marks between 60 and 69
        } else { // If the mark is below 60
            System.out.println("'F'im dissapointed"); // Print grade F for marks below 60
        }

        // Close the 'reader' object to free up resources
        reader.close(); 
    }
}
