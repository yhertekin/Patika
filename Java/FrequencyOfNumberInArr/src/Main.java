import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

        for(int number : numbers){
            if(freq.containsKey(number)){
                freq.put(number, freq.get(number) + 1);
            }
            else {
                freq.put(number, 1);
            }
        }

        for (HashMap.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " repeated " + entry.getValue() + " times.");
        }

    }
}