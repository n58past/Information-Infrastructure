public class two_eighteen{
    public static void main(String[] args){

        // Creates float values for a,b
        // adds one to each the produces a ^ b for last column
        float a = 1,b = 2;
        System.out.println("a   b   pow(a, b)");
        System.out.println((int)a + "   " + (int)b + "   " + (int)Math.pow(a, b));

        a = a + 1;
        b = b + 1;
        System.out.println((int)a + "   " + (int)b + "   " + (int)Math.pow(a, b));

        a = a + 1;
        b = b + 1;
        System.out.println((int)a + "   " + (int)b + "   " + (int)Math.pow(a, b));
        
        a = a + 1;
        b = b + 1;
        System.out.println((int)a + "   " + (int)b + "   " + (int)Math.pow(a, b));
        
        a = a + 1;
        b = b + 1;
        System.out.println((int)a + "   " + (int)b + "   " + (int)Math.pow(a, b));

    }
}