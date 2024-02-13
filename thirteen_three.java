import java.util.ArrayList;
import java.math.*;

public class thirteen_three {
    public static void main(String[] args){
        ArrayList<Number> unsortedSequence = new ArrayList<>();

        // Creates random sequence and displays
        System.out.println("The original sequence ");
        unsortedSequence.add(45); // Add an integer 
        unsortedSequence.add(3445.53); // Add a double
        // Add a BigInteger
        unsortedSequence.add(new BigInteger("3432323234344343101"));
        // Add a BigDecimal
        unsortedSequence.add(new BigDecimal("2.0909090989091343433344343"));

        // Creates a deep copy of the original ArrayList
        ArrayList<Number> sortedSequence = new ArrayList<>();
        sortedSequence.addAll(unsortedSequence);

        // Shuffles randomly
        sort(sortedSequence);
        System.out.println();

        // Display output
        System.out.println("The sorted sequence ");
        for (int i = 0; i < 4; i++){
            System.out.print(sortedSequence.get(i) + " ");
        }
    }

    // Sorts
    public static void sort(ArrayList<Number> list){
        for (int i = 0; i < list.size() - 1; i++) {
            // Find the minimum in the list[i..list.length−1]
            Number currentMin = list.get(i); 
            int currentMinIndex = i;
            
            for (int j = i + 1; j < list.size(); j++) { 
                if (currentMin.doubleValue() > list.get(j).doubleValue()) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) { 
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
}

