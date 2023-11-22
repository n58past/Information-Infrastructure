public class seven_fifteen {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] integers = new int[10];
        System.out.print("Enter 10 numbers: "); 

        // User input
        for (int i = 0; i < 10; i++) {
            integers[i] = input.nextInt();
        }
        
        int[] distinct_integers = eliminateDuplicates(integers);

        System.out.print("The distinct numbers are ");

        // Display output
        for (int i = 0; i < distinct_integers.length; i++) {
            System.out.print(distinct_integers[i] + " ");
        }
        
        System.out.println();
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] distinct_max = new int[10];
        int count = 0;
        // Search values to ensure distinct
        for (int i: list) {
			if (linearSearch(distinct_max, i) == -1) {
				distinct_max[count] = i;
				count++;
			}
		}
        
        // Discards wasted array spots
        int[] distinct = new int[count];
        System.arraycopy(distinct_max, 0, distinct, 0, count);

        return distinct;
    }
    // Linear search for key
    public static int linearSearch(int[] list, int key) { 
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
