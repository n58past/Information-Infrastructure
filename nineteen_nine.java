import java.util.ArrayList;
import java.util.Scanner;

public class nineteen_nine {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> integers = new ArrayList<Integer>();

        System.out.print("Enter 10 integers: ");

        // User input
        for (int i = 0; i < 10; i++){
            integers.add(input.nextInt());
        }

        // Sorts integers
        sort(integers);

        // Displays sorted output
        System.out.println("The sorted integers are " + integers);
    }

    // Sorts an arrray
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.size() - 1; i++) {
            // Find the minimum in the list[i..list.length−1]
            currentMin = list.get(i);
            currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) { 
                if (currentMin.compareTo(list.get(j)) > 0) {
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
