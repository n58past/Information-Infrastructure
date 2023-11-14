public class six_one {
 public static void main(String[] args) { 
        System.out.println("The first 100 pentagonal numbers are \n"); 
        printPentagonalNumbers(100);
    }

    public static void printPentagonalNumbers(int numberOfPentagonals) {
        final int NUMBER_OF_PENTAGONAL_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of Pentagonal numbers
        int number = 1; // A number to be tested for Pentagonal
        
        // Repeatedly find Pentagonal numbers
        while (count < numberOfPentagonals) {
            // Print the pentagonal number and increase the count 1 
            int Pentagonal = getPentagonalNumber(number);
            count++;
            number++;

            if (count % NUMBER_OF_PENTAGONAL_PER_LINE == 0) {
                // Print the number and advance to the new line
                System.out.printf("%-7d\n", Pentagonal);
            }
            else
                System.out.printf("%-7d", Pentagonal);
        }
    }
    /** Gets a pentagonal number */
    public static int getPentagonalNumber(int number) {
        return number * (3 * number - 1) / 2;
    }
}
