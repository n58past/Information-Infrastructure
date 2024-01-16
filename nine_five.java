import java.util.GregorianCalendar;

public class nine_five {
    public static void main(String[] args){
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Current year: " + calendar.get(GregorianCalendar.YEAR) 
            + "\nCurrent month: " + calendar.get(GregorianCalendar.MONTH)
            + "\nCurrent day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));

        calendar.setTimeInMillis(1234567898765L);

        System.out.println("Year: " + calendar.get(GregorianCalendar.YEAR) 
            + "\nMonth: " + calendar.get(GregorianCalendar.MONTH)
            + "\nDay: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
