import java.util.Scanner;

public class four_one {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 

        // Receive input from user
        System.out.print("Enter the length from the center to a vertex: ");
        Double r = input.nextDouble();

        // Find the length of a side given the vertex length
        Double side = (2 * r * Math.sin(Math.PI / 5));

        // Find the area given the side length
        Double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));

        // Display area
        System.out.println("The area of the pentagon is " + Math.round(area * 100) / 100.0);
    }
}
