import java.util.Scanner;

public class six_seven {
    public static void main(String[] args){
        final int TOTAL_YEARS = 30;

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        // Ger monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Print table
        System.out.println("Years     Future Value");
		for (int years = 1; years <= TOTAL_YEARS; years++) {
			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n", 
				futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
        }
    }

    // Retrieve investment value
    public static double futureInvestmentValue(
        double investmentAmount, double monthlyInterestRate,int years){
            return ((int)(investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12) * 100) / 100.0);
        }
}
