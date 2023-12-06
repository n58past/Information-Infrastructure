import java.util.Scanner;

public class eight_twelve {
    public static void main(String[] args) { 
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter filing status
        System.out.print("(0-single filer, 1-married jointly or " +
            "qualifying widow(er), 2-married separately, 3-head of " + 
            "household) Enter the filing status: ");
        
        // Checks validity
        int status = input.nextInt();
        if (status != 0 && status != 1 && status != 2 && status != 3){
            System.out.println("Error: invalid status");
            System.exit(1);
        }
        // Prompt the user to enter taxable income
        
        System.out.print("Enter the taxable income: "); 
        double income = input.nextDouble();
        
        // Display the result
        System.out.println("Tax is " + (int)(getTaxes(status, income) * 100) / 100.0);
    }

    public static double getTaxes(int status, double income){
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950}, {16700, 67900, 137050, 208850, 372950},
            {8350, 33950, 68525, 104425, 186375},
            {11950, 45500, 117450, 190200, 372950}};

        double tax = 0;
        int incomeBracket = 0;

        // Determines income bracket
        while (incomeBracket < 5 && income > brackets[status][incomeBracket]){
            if (income > brackets[status][4]){
                incomeBracket = 5; 
            }
            incomeBracket++;
        }
        
        // Finds tax burden given bracket
        switch (incomeBracket) {
            case 0: tax = income * rates[0];    
                    break;
            case 1: tax = (brackets[status][0] * rates[0] +
                            (income - brackets[status][0]) * rates[1]);
                    break;
            case 2: tax = (brackets[status][0] * rates[0] +
                            (brackets[status][1] - brackets[status][0]) * rates[1] +
                            (income - brackets[status][1]) * rates[2]);
                    break;
            case 3: tax = (brackets[status][0] * rates[0] +
                            (brackets[status][1] - brackets[status][0]) * rates[1] +
                            (brackets[status][2] - brackets[status][1]) * rates[2] +
                            (income - brackets[status][2]) * rates[3]);
                    break;
            case 4: tax = (brackets[status][0] * rates[0] +
                            (brackets[status][1] - brackets[status][0]) * rates[1] +
                            (brackets[status][2] - brackets[status][1]) * rates[2] +
                            (brackets[status][3] - brackets[status][2]) * rates[3] +
                            (income - brackets[status][3]) * rates[4]);
                    break;
            case 5: tax = (brackets[status][0] * rates[0] +
                            (brackets[status][1] - brackets[status][0]) * rates[1] +
                            (brackets[status][2] - brackets[status][1]) * rates[2] +
                            (brackets[status][3] - brackets[status][2]) * rates[3] +
                            (brackets[status][4] - brackets[status][3]) * rates[4] +
                            (income - brackets[status][4]) * rates[5]);
                    break;
        }
    
        return tax;
    }
}