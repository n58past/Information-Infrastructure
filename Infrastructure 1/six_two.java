import java.util.Scanner;

public class six_two {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter an interger: ");
        int startingInteger = input.nextInt();
        
        // Output sum
        System.out.println("The sum of the digits in " + startingInteger
            + " is " + sumDigits(startingInteger));
    }

    // Get sum of digits
    public static int sumDigits(int number){
        int sum = 0;
        do  {
            sum += (number % 10);
            number /= 10;
        } while (number > 0);
        return sum;
    }
}
