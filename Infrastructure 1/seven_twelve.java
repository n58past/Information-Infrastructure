public class seven_twelve {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter 10 integers: "); 

        // User input
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // Reverse numbers
        int reverse_numbers[] = reverse(numbers) ;
        
        // Output Result
        System.out.println("The integers in reverse are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(reverse_numbers[i] + " ");
        }

        System.out.println();
    }
    public static int[] reverse(int[] list) {
        // Create new reversed array
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        
        return result;
    }
}

