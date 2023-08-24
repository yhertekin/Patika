import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double taxRate = 0.18;
        double withoutTax = 0;
        double withTax = 0;
        double tax = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Price without taxes: ");
        withoutTax = input.nextDouble();
        tax = withoutTax * taxRate;
        withTax = withoutTax + tax;

        System.out.println("Tax rate: " + taxRate);
        System.out.println("Without tax: " + withoutTax);
        System.out.println("Tax: " + tax);
        System.out.println("With tax: " + withTax);
    }
}