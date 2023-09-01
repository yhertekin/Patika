import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();
        int max = number;
        int min = number;

        do {
            System.out.print("Enter a number (-1 to exit) : ");
            number = input.nextInt();
            if(number > max){
                max = number;
            }
            if(number < min && number != -1) {
                min = number;
            }
        }while(number != -1);

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);

    }
}