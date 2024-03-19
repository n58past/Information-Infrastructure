import java.util.Scanner;

public class eighteen_eight {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int forwardValue;

        // User input
        System.out.print("Enter an integer: ");
        forwardValue = input.nextInt();

        // Display output
        System.out.print("The reversal of " + forwardValue +
            " is ");
        reverseDisplay(forwardValue);
    }

    public static void reverseDisplay(int value){
        // Displays last digit the removes from value
        if (value != 0){
            System.out.print(value % 10);
            value = value / 10;
            reverseDisplay(value);
        }
    }
}
