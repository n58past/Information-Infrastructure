import java.util.Scanner;

public class three_ten {
    public static void main(String[] args){
        // Generate two random integers less than 100
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);


        // Prompt the student to answer "What is number1 + number2?"
        System.out.print
        ("What is " + number1 + " + " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // 4. Grade the answer and display the result
        if (number1 + number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
        }
    }
}
