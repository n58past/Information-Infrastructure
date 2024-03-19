import java.util.Scanner;

public class eighteen_eleven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int value;

        // User input
        System.out.print("Enter an integer for summation: ");
        value = input.nextInt();

        // Display output
        System.out.println("The sum of the digits in " + value +
            " is " + sumDigits(value));
    }

    public static int sumDigits(long n) {
        int sum = 0;

        // Sums last digit to recursion of value with digit removed
        if (n != 0){
            sum = (int)(n % 10) + sumDigits(n / 10);
        }

        return sum;
    }
}