import java.util.Scanner;
public class two_twenty {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Enter balance and interest
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

        // Get total interest cost
        double interest = balance * (annualInterestRate / 1200.0);

        System.out.println("The interest is " + Math.round(interest * 100000) / 100000.0);
    }
}
