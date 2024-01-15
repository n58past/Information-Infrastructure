import java.util.Scanner;

public class four_six {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate three random angles beteww 0 and 2pi
        Double angle_1 = (Math.random() * (2 * Math.PI));
        Double angle_2 = (Math.random() * (2 * Math.PI));
        Double angle_3 = (Math.random() * (2 * Math.PI));
        
        // Find the points of a circle with radius 40 centered at (0,0)
        Double x_1 = 40 * Math.cos(angle_1);
        Double y_1 = 40 * Math.sin(angle_1);
        Double x_2 = 40 * Math.cos(angle_2);
        Double y_2 = 40 * Math.sin(angle_2);
        Double x_3 = 40 * Math.cos(angle_3);
        Double y_3 = 40 * Math.sin(angle_3);

        // Find the side lengths with the points
        Double a = Math.sqrt(Math.pow(x_1 - x_2, 2) + Math.pow(y_1 - y_2, 2));
        Double b = Math.sqrt(Math.pow(x_1 - x_3, 2) + Math.pow(y_1 - y_3, 2));
        Double c = Math.sqrt(Math.pow(x_2 - x_3, 2) + Math.pow(y_2 - y_3, 2));

        // Find the angles with the previous side lenghts
        Double angle_A = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
        Double angle_B = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
        Double angle_C = Math.toDegrees(Math.acos((a * a + b * b - c * c ) / (2 * a * b)));

        // Display output
        System.out.println("The three angles generated are " + 
            Math.round(angle_A * 1000) / 1000.0 + " " +  
            Math.round(angle_B * 1000) / 1000.0 + " "  + 
            Math.round(angle_C * 1000) / 1000.0);

    }
}