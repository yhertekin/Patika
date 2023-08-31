import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int endNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        endNumber = input.nextInt();

        for(int i = 0; i <= endNumber; i++){
            if((i % 4 == 0) && (i % 3 == 0)){
                System.out.println(i + " divisible by 4 and 3");
            }
        }
    }
}