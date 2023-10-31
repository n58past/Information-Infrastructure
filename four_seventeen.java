import java.util.Scanner;

public class four_seventeen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a year: "); 
        int year = input.nextInt();
        input.nextLine();

        System.out.print("Enter a month: ");
        String month = input.nextLine();
        int month_num;

        // Check if the year is a leap year
        boolean isLeapYear =
            (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        // Check month and display days
        switch(month){
            case "Jan":
            case "Mar":
            case "May":
            case "July":
            case "Aug":
            case "Oct":
            case "Dec":
                System.out.println(month + " " + year + " has 31 days"); break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                System.out.println(month + " " + year + " has 30 days"); break;
            case "Feb":
                if (isLeapYear)
                    System.out.println(month + " " + year + " has 28 days");
                else
                    System.out.println(month + " " + year + " has 29 days");
                ; break;
            default : System.out.println(month + " is not a correct month name");
        }
    }
}
