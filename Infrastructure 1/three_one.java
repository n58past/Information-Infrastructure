import java.util.Scanner;

public class three_one {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Receive inputs for coefficients
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();  

        // Calculate discriminate
        double discrim = b * b - 4 * a * c;

        System.out.print("The equation has ");
        if (discrim == 0){
            double root1 = (-b)/ (2.0 * a);
            System.out.print("one root " + Math.round(root1 * 1000000) / 1000000.0);
        }
        else if (discrim > 0){
            // Calculate quadratic formula for each root
            // (-b +- (b^2 - 4ac)^1/2)/2a
            double root1 = ((-b) + Math.pow(b * b - 4 * a * c, 0.5))/ (2.0 * a);
            double root2 = ((-b) - Math.pow(b * b - 4 * a * c, 0.5))/ (2.0 * a);
            System.out.print("two roots " + Math.round(root1 * 1000000) / 1000000.0 + 
                " and " +  Math.round(root2 * 1000000) / 1000000.0);
        }
        else
            System.out.print("no real roots");
    }
}
