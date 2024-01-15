public class seven_two {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter 10 integers: "); 

        // User input while reversing order
        for (int i = 0; i < 10; i++) {
            numbers[9 - i] = input.nextInt();
        }

        // Display result
        System.out.println("The integers in reverse are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
