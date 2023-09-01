import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int step, temp, prev = 0, next = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of steps : ");
        step = input.nextInt();

        for(int i = 0; i < step; i++){
            System.out.println(prev + " + " + next +  " = " + (prev + next));
            temp = next;
            next = prev + next;
            prev = temp;
        }

    }
}