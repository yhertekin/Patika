import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.print("Enter number: ");
            numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}

