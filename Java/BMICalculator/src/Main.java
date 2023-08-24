import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double height = 0;
        double weight = 0;
        double bmi = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in meters : ");
        height = input.nextDouble();

        System.out.print("Enter weight in kg : ");
        weight = input.nextDouble();

        bmi = weight / (height * height);

        System.out.println("Your BMI is : " + bmi);

    }
}