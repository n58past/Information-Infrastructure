import java.util.Scanner;

public class eighteen_three {
    public static void main(String[] args){
        // User input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("The greatest common divisor of " + a 
            + " and " + b + " is " + gcd(a, b));
    }

    // GCD using Euclidean Algorithm
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
