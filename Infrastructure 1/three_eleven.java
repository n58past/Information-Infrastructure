import java.util.Scanner;

public class three_eleven {
    public static void main(String[] args){

        // Create a Scanner
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a month and a year (i.e. January, 2012 is 1, 2012): ");
        int month = input.nextInt();
        int year = input.nextInt();


        // Check if the year is a leap year
        boolean isLeapYear =
            (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        // Determine which month and print days
        System.out.print(" There are");
        switch(month - 1)
        {
            case 0: System.out.print(" 31 days in January,"); break;
            case 1: System.out.print((isLeapYear == false ? " 28 days in February," : " 29 days in February,")); break;
            case 2: System.out.print(" 31 days in March,"); break;
            case 3: System.out.print(" 30 days in April,"); break;
            case 4: System.out.print(" 31 days in May,"); break;
            case 5: System.out.print(" 30 days in June,"); break;
            case 6: System.out.print(" 31 days July,"); break;
            case 7: System.out.print(" 31 days August,"); break;
            case 8: System.out.print(" 30 days September,"); break;
            case 9: System.out.print(" 31 days October,"); break;
            case 10: System.out.print(" 30 days November,"); break;
            case 11: System.out.print(" 31 days December,"); break;
        }
        System.out.println(" " + year);
    }
}
