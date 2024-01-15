public class five_six {
    public static void main(String[] args) {
        // Declare kilometers per mile for conversion
        final double kilometers_per_mile = 1.609;

        // Display the table heading
        System.out.println("Miles        Kilometers    " + 
            "|    Kilometers    Miles");

        // Display table body
        for (int i = 1; i <= 10; i++)
            System.out.printf("%-13d%-13.3f |    %-14d%-10.3f\n",i , (i * kilometers_per_mile), 
                (5 * i + 15), (5 * i + 15)/ kilometers_per_mile);
    }
}
