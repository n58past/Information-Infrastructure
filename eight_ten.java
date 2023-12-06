public class eight_ten {
    public static void main(String[] args) { 
        int[][] m = getArray(); // Get an array

        // Display array
        for (int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
                if ((j + 1) % 4 == 0)
                    System.out.println();
            }
        }

        // Display result
        System.out.println("The largest row index: " + maxRow(m));
        System.out.println("The largest column index: " + maxColumn(m));

    }
    
    public static int[][] getArray() {
        // Generate array values
        int[][] m = new int[4][4];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++) 
                m[i][j] = (int)(Math.random() * 2);

        return m;
    }

    // Sum each row
    public static int sumRow(int[][] m, int rowIndex){
        int total = 0;
        for (int column = 0; column < m[rowIndex].length; column++) {
                total += m[rowIndex][column];
        }
        return total;
    }

    // Sum each column
    public static int sumColumn(int[][] m, int columnIndex){
        int total = 0;
        for (int row = 0; row < m.length; row++) {
                total += m[row][columnIndex];
        }
        return total;
    }

    public static int maxRow(int[][] m) {
        int maxRowIndex = 0;
        int currentMaxSum = sumRow(m, 0);

        // Compare summed rows to find max
        for (int i = 1; i < 4; i++){
            if (currentMaxSum < sumRow(m, i)){
                currentMaxSum = sumRow(m, i);
                maxRowIndex = i;
            }
        }

        return maxRowIndex;
    }

    public static int maxColumn(int[][] m) {
        int maxColumnIndex = 0;
        int currentMaxSum = sumColumn(m, 0);

        // Compare summed columns to find max
        for (int i = 1; i < 4; i++){
            if (currentMaxSum < sumColumn(m, i)){
                currentMaxSum = sumColumn(m, i);
                maxColumnIndex = i;
            }
        }

        return maxColumnIndex;
    }
}
