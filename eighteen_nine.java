import java.util.Scanner;

public class eighteen_nine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String forwardValue;

        // User input
        System.out.print("Enter a string: ");
        forwardValue = input.nextLine();

        // Display output
        System.out.print("The reversal of " + forwardValue +
            " is ");
        reverseDisplay(forwardValue);
    }

    public static void reverseDisplay(String value){
        if (value.length() != 0){
            // Displays last character
            System.out.print(value.charAt(value.length() - 1));

            // Recursion on substring with last character removed
            reverseDisplay(value.substring(0, value.length() - 1));
        }
    }
}
