import java.math.*;
import java.util.Scanner;

public class eighteen_one {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer of any size:");
        String numberString = input.nextLine();
        
        BigInteger bigNumber = new BigInteger(numberString);
        System.out.println("Factorial of " + bigNumber + " is " 
            + factorial(bigNumber));
    }
        
    public static BigInteger factorial(BigInteger i){
        if  (i.equals(BigInteger.ZERO))
            return BigInteger.ONE;
        else
            return i.multiply(factorial(i.subtract(BigInteger.ONE)));
    }
}

