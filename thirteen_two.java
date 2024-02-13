import java.util.*;
import java.math.*;

public class thirteen_two {
    public static void main(String[] args){
        ArrayList<Number> testSequence = new ArrayList<>();

        // Creates random sequence and displays
        testSequence.add(45); // Add an integer 
        testSequence.add(3445.53); // Add a double
        // Add a BigInteger
        testSequence.add(new BigInteger("3432323234344343101"));
        // Add a BigDecimal
        testSequence.add(new BigDecimal("2.0909090989091343433344343"));

        System.out.println("The original sequence ");
        for (int i = 0; i < testSequence.size(); i++){
            System.out.print(testSequence.get(i) + " ");
        }
        
        // Creates a deep copy of the original ArrayList
        ArrayList<Number> shuffledSequence = new ArrayList<>();
        shuffledSequence.addAll(testSequence);

        // Shuffles randomly
        shuffle(shuffledSequence);
        System.out.println();


        // Display output
        System.out.println("The shuffled sequence ");
        for (int i = 0; i < shuffledSequence.size(); i++){
            System.out.print(shuffledSequence.get(i) + " ");
        }
    }

    // Shuffles randomly
    public static void shuffle(ArrayList<Number> list){
        Number temp;
        Random rand = new Random();

        // Uses random integer to shift location of each value 
        // at least once.
        for (int i = 0; i < list.size(); i++){
            int randomInt = rand.nextInt(list.size());
            temp = list.get(randomInt);
            list.set(randomInt, list.get(i));
            list.set(i, temp);
        }
    }
}

