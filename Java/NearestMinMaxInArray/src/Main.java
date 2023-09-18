import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int min = findMin(numbers);
        int max = findMax(numbers);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int val = input.nextInt();

        for(int number : numbers){
            if(number > min &&  number < val){
                min = number;
            }
            if(number < max && number > val){
                max = number;
            }
        }

        System.out.println("Nearest min: " + min);
        System.out.println("Nearest max: " + max);

    }

    public static int findMax(int[] numbers){
        int max = numbers[0];
        for(int number : numbers){
            if(number > max){
                max = number;
            }
        }
        return max;
    }
    public static int findMin(int[] numbers){
        int min = numbers[0];
        for(int number : numbers){
            if(number < min){
                min = number;
            }
        }
        return min;
    }
}