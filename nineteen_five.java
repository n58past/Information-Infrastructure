import java.util.ArrayList;
import java.util.Scanner;

public class nineteen_five {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        Integer[] integers = new Integer[10];

        System.out.print("Enter 10 integers: ");

        for (int i = 0; i < integers.length; i++){
            integers[i] = input.nextInt();
        }

        System.out.print("The max integer in [");
        for (int j = 0; j < integers.length; j++){
            if (j == 0)
                System.out.print(integers[j]);
            else
                System.out.print(", " + integers[j]);
        }
        System.out.print( "] is " + max(integers));
    }

    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];

        for (int i = 1; i < list.length; i++) {
            if (max.compareTo(list[i]) < 0) {
                max = list[i];
            }
        }
        return max;
    }
}
