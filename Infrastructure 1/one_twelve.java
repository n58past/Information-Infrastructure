public class one_twelve {
    public static void main(String[] args){

        System.out.print("The average speed in kilometers per hour is ");

        // Convert miles to kilometers, miles x 1.6.
        // Seconds ran is equal to 1 + 40/60 + 35/3600 
        // = 3600/3600 + 2400/3600 + 35/3600 = 6035/3600

        System.out.println((float)((24 * 1.6) / (6035 /3600.0)));
    }
}
