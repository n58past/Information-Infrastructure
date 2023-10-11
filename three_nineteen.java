import java.util.Scanner;

public class three_nineteen {
    public static void main(String[] args){
        // Create Scanner
        Scanner input = new Scanner(System.in);
        
        // Get sides from user
        System.out.print("Enter three sides of a triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Calculate three sides
        double sides_ab = a + b;
        double sides_ac = a + c;
        double sides_bc = b + c;

        // Determine validity
        if (sides_ab > c && sides_ac > b && sides_bc > a)
            System.out.println("The perimeter of a triangle with sides " +
                a + " " + b + " " + c + " is " + (sides_ab + c));
        else
            System.out.println("Input invalid");
    }
}
