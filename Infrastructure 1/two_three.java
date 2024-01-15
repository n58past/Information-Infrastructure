import java.util.Scanner;

public class two_three {
    public static void main(String[] args){
        // User input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        // Convert feet to meters
        double meter = feet * 0.305;
        
        System.out.println(feet + " feet is " + meter + " meters");
    }
}
