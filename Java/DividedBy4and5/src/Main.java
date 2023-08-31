import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int start, end;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        start = input.nextInt();

        System.out.print("Enter the ending number: ");
        end = input.nextInt();

        int min = Math.min(start, end);
        int max = Math.max(start, end);

        for(int i = min; i <= max; i++){
            if((i % 4 == 0) && (i % 5 == 0)){
                System.out.println(i + " divisible by 4 and 5");
            }
        }



    }
}