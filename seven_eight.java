public class seven_eight {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] integers = new int[10];
        double[] doubles = new double[10];
        System.out.print("Enter 10 integers: "); 
        
        // User input
        for (int i = 0; i < 10; i++) {
            integers[i] = input.nextInt();
        }

        // Display average
        System.out.println("The average of the given 10 integers is " + average(integers));

        System.out.print("Enter 10 double values: "); 


        // User input
        for (int i = 0; i < 10; i++) {
            doubles[i] = input.nextDouble();
        }

        // Display
        System.out.println("The average of the given 10 double values is " + average(doubles));
    }
        public static double average(int[] integers) {
            double sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += integers[i];
            }
            return (sum / 10);
        }
        
        public static double average(double[] doubles){
            double sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += doubles[i];
            }
            return (sum / 10);
        }
}

