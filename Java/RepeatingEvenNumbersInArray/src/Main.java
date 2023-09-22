public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,5,6,7,8};
        int[] duplicated = new int[numbers.length];
        int duplicatedIndex = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(j != i && numbers[i] == numbers[j] && numbers[i] % 2 == 0){
                    duplicated[duplicatedIndex++] = numbers[i];
                    break;
                }
            }
        }

        System.out.println("Repeating even numbers");
        print(duplicated);
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}