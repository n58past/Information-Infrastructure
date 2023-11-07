public class five_four {
    public static void main(String[] args) {
        // Display the table heading
        System.out.println("Miles        Kilometers");
        
        // Display table body
        for (int i = 1; i <= 10; i++)    {
            System.out.printf("%-13d%-10.3f\n", i, (i * 1.609));
        }
    }
}
