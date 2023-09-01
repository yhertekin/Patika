import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        int total = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (total == number && number != 0) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}