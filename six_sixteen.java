public class six_sixteen {
    public static void main(String[] args){
        final int endingYear = 2020;

        // Print table
        System.out.println("Year      Days in a Year");
        for (int year = 2000; year <= endingYear; year++){
            System.out.println(year + "      " + numberOfDaysInAYear(year));
        }
    }

    // Return number of years for year
    public static int numberOfDaysInAYear(int year){
        if (isLeapYear(year))
            return 366;
        else
            return 365;
        
    }

    // Determine leap years
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}