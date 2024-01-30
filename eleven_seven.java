import java.util.ArrayList;

public class eleven_seven {
    public static void main(String[] args){
        ArrayList<Integer> testSequence = new ArrayList<>();

        // Creates random sequence and displays
        System.out.println("The original sequence ");
        for (int i = 0; i < 10; i++){
            testSequence.add((int)(Math.random() * 10));
            System.out.print(testSequence.get(i) + " ");
        }

        // Shuffles randomly
        shuffle(testSequence);
        System.out.println();

        // Display output
        System.out.println("The shuffled sequence ");
        for (int i = 0; i < 10; i++){
            System.out.print(testSequence.get(i) + " ");
        }
    }

    // Shuffles randomly
    public static void shuffle(ArrayList<Integer> list){
        int temp = 0;

        // Uses random integer to shift location of each value 
        // at least once.
        for (int i = 0; i < 10; i++){
            int randomInt = (int)(Math.random() * 10);
            temp = list.get(randomInt);
            list.set(randomInt, list.get(i));
            list.set(i, temp);
        }
    }
}
