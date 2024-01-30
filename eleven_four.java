import java.util.Scanner;
import java.util.ArrayList;

public class eleven_four {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int value;
        ArrayList<Integer> arraySequence = new ArrayList<>();

        // User input
        System.out.print("Enter numbers (input ends with 0): ");

        // Add values to ArrayList
        do {
            value = input.nextInt();
            if (value != 0)
                arraySequence.add(value);
        } while (value != 0);

        // Display output
        System.out.print("The max value in ");

        // Display each value
        for (int i = 0; i < arraySequence.size(); i++){
            System.out.print(arraySequence.get(i) + " ");
        }

        // Display the max
        System.out.print("is " + max(arraySequence));

        
    }
    
    // Finds max value
    public static Integer max(ArrayList<Integer> list){
        int max = 0;

        // Returns null result
        if (list.size() == 0)
            return null;

        // Finds max and returns
        else {
            for (int i = 0; i < list.size(); i++){
                if (max <= list.get(i)){
                    max = list.get(i);
                }
            }
            return max;
        }
    }
}
