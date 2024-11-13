package bmicalculator;
import java.util.Scanner;
public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Input height in meters
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obesity";
        }

        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("BMI Category: " + category);

        scanner.close();
    }
}
