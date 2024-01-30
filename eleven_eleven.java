import java.util.Scanner;
import java.util.ArrayList;

public class eleven_eleven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int value;
        ArrayList<Integer> numbers = new ArrayList<>();

        // User input
        for (int i = 1; i < 6; i++){
            System.out.print("Enter integer " + i + ": ");
            value = input.nextInt();
            numbers.add(value);
        }
        // Display Output
        System.out.println("In order from least to greatest: ");

        // Sort
        sort(numbers);
        
        // Display sorted
        for (int i = 0; i < 5; i++){
            System.out.println(numbers.get(i));
        }
    }

    // Selection Sort
    public static void sort(ArrayList<Integer> list){
        for (int i = 0; i < list.size() - 1; i++) {
            // Find the minimum in the list[i..list.length−1]
            int currentMin = list.get(i); 
            int currentMinIndex = i;
            
            for (int j = i + 1; j < list.size(); j++) { 
                if (currentMin > list.get(j)) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }
            
            // Swap list.get(i) with list.get(currentMinIndex) if necessary
            if (currentMinIndex != i) { 
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
}
