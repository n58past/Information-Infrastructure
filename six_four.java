import java.util.Scanner;

public class six_four {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter an integer: ");
        int startingNumber = input.nextInt();

        // Print reverse
        System.out.print("The reverse of " + startingNumber 
            + " is ");
        reverse(startingNumber);
        System.out.println();
    }
    
    // Get reverse number by removing digits
    public static void reverse(int number){
        while (number > 0){
            System.out.print((number % 10));
            number /= 10;
        }
    }
}
