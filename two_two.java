import java.util.Scanner;

public class two_two {
    public static void main(String[] args){
        // User input
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        // Area and volume of cylinder
        double area = radius * radius * PI;
        double volume = area * length;
        
        System.out.println("The area is " + (float)(area));
        System.out.println("The volume is " + (Math.round(volume * 10) / 10.0));
    }
}
