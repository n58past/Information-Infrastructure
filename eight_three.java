public class eight_three {
    /** Main method */
    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        
        int[][] correctCount = new int[2][8];
        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        
        for (int a = 0; a < answers.length; a++){
            correctCount[0][a] = a;
        }

        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) 
                    correctCount[1][i]++;
            }
        }
        
        selectionSort(correctCount);

        for (int i = 0; i < answers.length; i++){
            System.out.println("Student " + correctCount[0][i] + "'s correct count is " + 
                correctCount[1][i]);
        }
    }

    public static void selectionSort(int[][] correctCount) { 
        for (int i = 0; i < 7; i++) {
            // Find the minimum in the array[i..list.length−1]
            int currentMin = correctCount[1][i];
            int currentMinStudent = correctCount[0][i]; 
            int currentMinIndex = i;

            
            for (int j = i + 1; j < 8; j++) { 
                if (currentMin > correctCount[1][j]) {
                    currentMin = correctCount[1][j];
                    currentMinStudent = correctCount[0][j];
                    currentMinIndex = j;
                }
            }
            
            // Swap if necessary
            // Maintaining student consistency
            if (currentMinIndex != i) { 
                correctCount[1][currentMinIndex] = correctCount[1][i];
                correctCount[0][currentMinIndex] = correctCount[0][i]; 
                correctCount[1][i] = currentMin;
                correctCount[0][i] = currentMinStudent;
            }
        }
    }
}

