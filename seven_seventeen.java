public class seven_seventeen {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of students: "); 
        int NUMBER_OF_STUDENTS = input.nextInt();
        String[] names = new String[NUMBER_OF_STUDENTS];
        int[] scores = new int[NUMBER_OF_STUDENTS];

        System.out.print("Enter the " + NUMBER_OF_STUDENTS + " student's name and score: "); 

        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            names[i] = input.next();
            scores[i] = input.nextInt();
        }

        selectionSort(scores, names);

        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            System.out.println(names[i] + " " + scores[i]);
        }
    }

    public static void selectionSort(int[] scores, String[] names) { 
        for (int i = 0; i < scores.length - 1; i++) {
            // Find the minimum in the list[i..list.length−1]
            int currentMax = scores[i]; 
            int currentMaxIndex = i;
            String currentMaxName = names[i];
            
            for (int j = i + 1; j < scores.length; j++) { 
                if (currentMax < scores[j]) {
                    currentMax = scores[j];
                    currentMaxIndex = j;
                    currentMaxName = names[j];
                }
            }
            
            // Swap list[i] with list[currentMinIndex] if necessary
            // Maintaining name consistency
            if (currentMaxIndex != i) { 
                scores[currentMaxIndex] = scores[i];
                names[currentMaxIndex] = names[i]; 
                scores[i] = currentMax;
                names[i] = currentMaxName;
            }
        }
    }
}
