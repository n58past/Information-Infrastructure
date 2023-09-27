import java.util.Scanner; 

public class two_twentyThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Enter driving distance
        System.out.print("Enter the driving distance: ");
        double drivingDistance = input.nextDouble();

        // Enter miles per gallon
        System.out.print("Enter the miles per gallon: ");
        double mpg = input.nextDouble();

        // Enter price per gallon
        System.out.print("Enter the price per gallon: ");
        double ppg = input.nextDouble();

        // Calculate the cost by getting total gallons * price per gallon
        double cost = (drivingDistance / mpg) * ppg;

        // Display cost
        System.out.println("The cost of driving is " + Math.round(cost * 100) / 100.00);
    }
}
