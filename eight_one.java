import java.util.Scanner;

public class eight_one {
    public static void main(String[] args) { 
        double[][] m = getArray(); // Get an array

        // Display result
        for (int i = 0; i < 4; i++)
            System.out.print("\nSum of the elements at column " + i 
                + " is " + sumColumn(m, i));
        System.out.println();
    }
    
    public static double[][] getArray() {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Enter array values
        double[][] m = new double[3][4];
        System.out.println("Enter a " + m.length + "-by-"
        + m[0].length + " matrix row by row:"); 
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++) 
                m[i][j] = input.nextDouble();

        return m;
    }

    public static double sumColumn(double[][] m, int columnIndex){
        double total = 0;

        // Sum each value in column
        for (int row = 0; row < m.length; row++) {
                total += m[row][columnIndex];
        }

        return total;
    }
}
