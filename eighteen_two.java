import java.util.Scanner;

public class eighteen_two {
    /** Main method */  
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter an index for a Fibonacci number: "); 
        int index = input.nextInt();

        // Find and display the Fibonacci number
        System.out.println("The Fibonacci number at index " 
            + index + " is " + fib(index));
    }

    /** The method for finding the Fibonacci number */
    public static long fib(int index) { 
        int f0 = 0; //  For fib(0)
        int f1 = 1; //  For fib(1)
        int currentFib;

        if (index == 0)
            return 0;
        if (index == 1)
            return 1;
        
        for (int i = 2; i <= index; i++) { 
            currentFib = f0 + f1;
            f0 = f1;
            f1 = currentFib;
            }
            // After the loop, currentFib is fib(n)

        return f1;
    }
}