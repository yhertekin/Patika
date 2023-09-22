import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = fillArray();

        System.out.print("Original Array: ");
        printArray(numbers);

        sortArray(numbers);
        System.out.print("Sorted Array: ");
        printArray(numbers);
    }

    public static int[] fillArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        for(int i = 0; i < numbers.length; i++){
            System.out.print((i + 1) + ". number: ");
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}