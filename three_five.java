import java.util.Scanner;

public class three_five {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int numToday = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int numElapsed = input.nextInt();
        int numFuture = (numToday + numElapsed) % 7;

        System.out.print("Today is ");
        switch (numToday)
        {
            case 0: System.out.print("Sunday"); break;
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday");
        }

        System.out.print(" and the future day is ");
        switch (numFuture)
        {
            case 0: System.out.print("Sunday"); break;
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday");
        }
    }
}
