public class seven_one {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of students: "); 
        int NUMBER_OF_STUDENTS = input.nextInt();
        int[] scores = new int[NUMBER_OF_STUDENTS];
        int greatestScore = 0;

        System.out.print("Enter " + NUMBER_OF_STUDENTS + " scores: "); 

        // Get user input and greatest score
        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            scores[i] = input.nextInt();
            if (greatestScore <= scores[i])
                greatestScore = scores[i];
        }


        // Compare to curve and display result
        for (int i = 0; i < NUMBER_OF_STUDENTS; i++){
            System.out.print("Student " + i + " score is " + scores[i]);
            if (scores[i] >= (greatestScore - 10))
               System.out.print(" and grade is A ");
            else if (scores[i] >= (greatestScore - 20))
               System.out.print(" and grade is B ");  
            else if (scores[i] >= (greatestScore - 30))
               System.out.print(" and grade is C ");  
            else if (scores[i] >= (greatestScore - 40))
               System.out.print(" and grade is D ");    
            else
               System.out.print(" and grade is F ");  
            System.out.println();
        }
    }
}
