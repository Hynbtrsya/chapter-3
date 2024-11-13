import java.util.Scanner;

public class IfDemo {

    public static void main(String[] args) {
        int grade;

        Scanner reader = new Scanner(System.in); 
        System.out.print("Enter your grade: ");
        grade = reader.nextInt();

        if (grade >= 65) {
            System.out.println("Passed");
         
        else
            System.out.println("Failed");
        }

        reader.close(); 
    }
}
