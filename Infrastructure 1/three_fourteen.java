import java.util.Scanner;

public class three_fourteen {
    public static void main(String[] args){
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Create random number, 0 or 1
        int coin = (int)(Math.random() * 2);


        // Get input from user
        System.out.print("Heads or Tails (i.e. 0 for Heads and 1 for Tails): ");
        int guess = input.nextInt();
        
        // Gets side of the coin
        String side;
        if (coin == 0)
            side = "Heads";
        else
            side = "Tails";

        // Compare guess and actual
        if (guess == coin)
            System.out.println("The coin was " + side + ", you're correct!");
        else
            System.out.println("The coin was " + side + ", you're incorrect.");
        
    }
}
