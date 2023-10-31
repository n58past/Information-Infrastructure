import java.util.Scanner;

public class four_twelve {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: "); 
        String hexString = input.nextLine();

        // Check if the hex string has exactly one character
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character"); 
            System.exit(1);
        }
        
        // Display decimal value for the hex digit
        char ch = Character.toUpperCase(hexString.charAt(0)); 
        switch (ch){
            case '0': System.out.println("The binary value is 0000"); break;
            case '1': System.out.println("The binary value is 0001"); break;
            case '2': System.out.println("The binary value is 0010"); break;
            case '3': System.out.println("The binary value is 0011"); break;
            case '4': System.out.println("The binary value is 0100"); break;
            case '5': System.out.println("The binary value is 0101"); break;
            case '6': System.out.println("The binary value is 0110"); break;
            case '7': System.out.println("The binary value is 0111"); break;
            case '8': System.out.println("The binary value is 1000"); break;
            case '9': System.out.println("The binary value is 1001"); break;
            case 'A': System.out.println("The binary value is 1010"); break;
            case 'B': System.out.println("The binary value is 1011"); break;
            case 'C': System.out.println("The binary value is 1100"); break;
            case 'D': System.out.println("The binary value is 1101"); break;
            case 'E': System.out.println("The binary value is 1110"); break;
            case 'F': System.out.println("The binary value is 1111"); break;
            default : System.out.println(ch + " is an invalid input");
        }
    }      
}
