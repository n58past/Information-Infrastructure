import java.util.Scanner;

public class two_eight {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();
        
        // Converts negative offesets to equivalent positive offset
        if (offset < 0){
            offset = offset + 24;
        }

        // GMT time
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currrentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        // Adds offset
        currentHour = (currentHour + offset) % 24;


        System.out.println("The current time is " + currentHour + ":"
            + currrentMinute + ":" + currentSecond);
    }
}
