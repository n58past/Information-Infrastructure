import java.util.Scanner;

public class four_five {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Receive user inputs
        System.out.print("Enter the number of sides: ");
        Double num_sides = input.nextDouble();
        System.out.print("Enter the side: ");
        Double side = input.nextDouble();

        // Find area given number of sides and side length
        Double area = (num_sides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / num_sides));

        // Display area
        System.out.println("The area of the polygon is " + area);
    }
}
