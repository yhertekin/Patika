import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int total = 0;
        int digitCount = (int) Math.log10(number) + 1;

        System.out.println("Digits of " + originalNumber + ": ");
        for (int i = digitCount - 1; i >= 0; i--) {
            int digit = (int) (number / Math.pow(10, i)) % 10;
            System.out.println(digit);
            total += digit;
        }
        System.out.println("Total of digits: " + total);
    }
}