import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        String zodiacSign = findChineseZodiacSign(birthYear);

        if (zodiacSign != null) {
            System.out.println("Your Chinese Zodiac sign is: " + zodiacSign);
        } else {
            System.out.println("Invalid birth year.");
        }
    }

    public static String findChineseZodiacSign(int year) {
        String[] zodiacSigns = {
                "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
                "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"
        };

        if (year >= 1900 && year <= 2099) {
            int zodiacIndex = (year - 1900) % 12;
            return zodiacSigns[zodiacIndex];
        } else {
            return null; // Invalid birth year
        }
    }
}