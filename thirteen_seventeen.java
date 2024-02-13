import java.util.Scanner;
import java.text.DecimalFormat;

public class thirteen_seventeen {
    public static void main(String[] args){
        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        Complex comp1 = new Complex(input.nextDouble(), input.nextDouble());
        System.out.print("Enter the second complex number: ");
        Complex comp2 = new Complex(input.nextDouble(), input.nextDouble());
        
        // Display output
        System.out.println(comp1 + " + " + comp2 + " = " + comp1.add(comp2).toSimpleString());
        System.out.println(comp1 + " - " + comp2 + " = " + comp1.subtract(comp2).toSimpleString());
        System.out.println(comp1 + " * " + comp2 + " = " + comp1.multiply(comp2).toSimpleString());
        System.out.println(comp1 + " / " + comp2 + " = " + comp1.divide(comp2).toSimpleString());
        System.out.println("|" + comp1 + "| = " + comp1.abs());

        // Clone and compare
        Complex comp3 = (Complex)comp1.clone();
        System.out.println(comp1 == comp3);
        System.out.println(comp3.getRealPart());
        System.out.println(comp3.getImaginaryPart());
        Complex comp4 = new Complex(4, -0.5);
        Complex[] list = {comp1, comp2, comp3, comp4};
        java.util.Arrays.sort(list);
        Complex.printComplexArray(list);
    }

    // Complelx class
    private static class Complex implements Cloneable, Comparable<Complex> {
        // a is real and b for imaginary
        private double a, b;

        // Constructors
        public Complex() {
            this.a = 0;
            this.b = 0;
        }

        public Complex(double a) {
            this.a = a;
            this.b = 0;
        }
        
        public Complex(double a, double b){
            this.a = a;
            this.b = b;
        }

        public double getRealPart(){
            return this.a;
        }

        public double getImaginaryPart(){
            return this.b;
        }

        // Implements addition, subtraction, division, multiplication
        public Complex add(Complex y){
            double c = y.getRealPart(), d = y.getImaginaryPart();
            return new Complex((this.a + c),(this.b + d));
        }

        public Complex subtract(Complex y){
            double c = y.getRealPart(), d = y.getImaginaryPart();
            return new Complex((this.a - c),(this.b - d));
        }

        public Complex multiply(Complex y){
            double c = y.getRealPart(), d = y.getImaginaryPart();
            return new Complex((this.a * c - this.b * d),(this.b * c + this.a * d));
        }

        public Complex divide(Complex y){
            double c = y.getRealPart(), d = y.getImaginaryPart();
            return new Complex((this.a * c + this.b * d) / (c * c + d * d),(this.b * c - this.a * d) / (c * c + d * d));
        }

        // returns Absolute value
        public double abs(){
            return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
        }

        @Override
        public String toString() {
            if (this.b == 0)
                return this.a + "";
            return "(" + this.a + " + " + this.b + "i)";
        }
        
        // Allows for print an array of complex numbers
        public static void printComplexArray(Complex[] list) {
            System.out.print("[");
            for (int i = 0; i < list.length; i++) {
                if (i != list.length - 1) {
                    System.out.print(list[i].toSimpleString() + ", ");
                } else {
                    System.out.print(list[i].toSimpleString());
                }
            }
            System.out.println("]");
        }

        // to string method without parentheses
        public String toSimpleString() {
            DecimalFormat df = new DecimalFormat("0.0###");
            if (this.b == 0)
                return this.a + "";
            return df.format(this.a) + " + " + df.format(this.b) + "i";
        }

        @Override
        public Complex clone() {
            try {
                return (Complex)super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(); // Can't happen
            }
        }

        @Override
        public int compareTo(Complex other) {
            return Double.compare(this.abs(), other.abs());
        }
    }
}
