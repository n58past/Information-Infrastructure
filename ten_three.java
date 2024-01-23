public class ten_three {
    public static void main(String[] args){
        // Test values
        MyInteger int1 = new MyInteger(92);
        MyInteger int2 = new MyInteger(16);
        MyInteger int3 = new MyInteger(97);
        MyInteger int4 = new MyInteger(97);

        // Creates array of test values
        MyInteger[] Test_Integers = new MyInteger[]{int1, int2, int3, int4};
        
        // Tests
        for (int i = 0; i < 3; i++){
            System.out.printf("is %d even? %s%n", Test_Integers[i].getValue(), Test_Integers[i].isEven());
            System.out.printf("is %d odd? %s%n", Test_Integers[i].getValue(), Test_Integers[i].isOdd());
            System.out.printf("is %d prime? %s%n", Test_Integers[i].getValue(), Test_Integers[i].isPrime());
        }

        System.out.printf("is 5 even? %s%n", MyInteger.isEven(5));
        System.out.printf("is 5 odd? %s%n", MyInteger.isOdd(5));
        System.out.printf("is 5 prime? %s%n", MyInteger.isPrime(5));
        
        System.out.printf("Does 97 = 97? %s%n", Test_Integers[3].equals(Test_Integers[3].getValue()));
        System.out.printf("Does 1 = 97? %s%n", Test_Integers[3].equals(1));

        System.out.printf("%d%n", MyInteger.parseInt(new char[] {'7', '4', '2'}));
        System.out.printf("%d%n", MyInteger.parseInt("1024"));

    }
}

// Create my integer class
class MyInteger{
    // Inital value
    int value;

    // Constructor
    public MyInteger(int newValue) {
        value = newValue;
    }

    // Return value
    public int getValue() {
        return value;
    }

    // Tests if even, odd, or prime
    public boolean isEven() {
        return (value % 2 == 0);
    }

    public boolean isOdd() {
        return (value % 2 == 1);
    }

    public boolean isPrime() {
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0) { // If true, number is not prime return false; 
                return false;// Number is not a prime
            }
        }
        return true;
    }

    public static boolean isEven(int myInt){
        return (myInt % 2 == 0);
    }

    public static boolean isOdd(int myInt){
        return (myInt % 2 == 0);
    }

    public static boolean isPrime(int myInt){
        for (int divisor = 2; divisor <= myInt / 2; divisor++) {
            if (myInt % divisor == 0) { // If true, number is not prime return false; 
                return false;// Number is not a prime
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInt){
        return myInt.isEven();
    }

    public static boolean isOdd(MyInteger myInt){
        return myInt.isOdd();
    }

    public static boolean isPrime(MyInteger myInt){
        return myInt.isPrime();
    }
    
    // Tests equality
    public boolean equals(int myInt){
        return (this.value == myInt);
    }

    public boolean equals(MyInteger myInt){
        return (this.value == myInt.value);
    }

    // Parses and converts values
    public static int parseInt(char[] values) {
        int result = 0;
        for (char i : values) {
            result = result * 10 + (i - '0');
        }
        return result;
    }

    public static int parseInt(String myString) {
        return Integer.parseInt(myString);
    }
}