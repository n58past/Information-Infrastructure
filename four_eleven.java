import java.util.Scanner;

public class four_eleven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): "); 
        int decimal = input.nextInt();

        // Display hex digit for decimal value
        if (decimal >= 0 && decimal < 10) {
            System.out.println("The hex digit is " + decimal); 
        }

        else if (decimal >= 10 && decimal < 15) { 
            System.out.println("The hex digit is " + (char)(decimal + 'A' - 10));
        }      
        else {
            System.out.println(decimal + " is an invalid input");
        }  
    }
}
