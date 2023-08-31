import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        int number = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter number: ");
            number = input.nextInt();
            if(number % 4 == 0){
                total += number;
            }
        }
        while(number % 2 == 0);

        System.out.println("Total numbers that are divisible by 4: " + total);
    }
}