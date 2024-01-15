import java.util.Scanner;

public class list_two_six {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter a degrreee in Farenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius ");
    }
}