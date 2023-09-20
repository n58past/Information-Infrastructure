import java.util.Scanner;

public class two_twelve {
    public static void main(String[] args){
        // User input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        // Runway length given speed and acceleration
        double length = (speed * speed) / (2 * acceleration);
        
        System.out.println("The mininum runway length for this airplane is " + (Math.round(length * 1000) / 1000.0));
    }
}
