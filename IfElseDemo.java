import java.util.Scanner;

public class IfElseDemo {

    public static void main(String[] args) {
        int grade;

        Scanner reader = new Scanner(System.in); 
        System.out.print("Enter your grade: ");
        grade = reader.nextInt();//read user input an integer

        if (grade >= 65) { //
            System.out.println("Passed");//if grade greater than 65 student will passed. 
        } else { //else grade lower than 65 failed
            System.out.println("Failed");
        }

        reader.close(); 
    }
}
