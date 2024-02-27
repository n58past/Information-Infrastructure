import java.io.*;
import java.util.Scanner;

public class seventeen_nineteen {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String filename = input.nextLine();

        FileInputStream in = new FileInputStream(filename);

        int value;
        while ((value = in.read()) != -1) {
            System.out.print(getHex(getBits(value)));
        }
    }

    // Convert 8-bit string to a 2-digit hex number
    public static String getHex(String bitString) {
        // Get first half hex number
        int value = (bitString.charAt(0) - '0') * 8 + 
            (bitString.charAt(1) - '0') * 4 +
            (bitString.charAt(2) - '0') * 2 +
            (bitString.charAt(3) - '0') * 1;

        String result = "" + toHexChar(value);

        // Get second half hex number
        value = (bitString.charAt(4) - '0') * 8 + 
        (bitString.charAt(5) - '0') * 4 +
        (bitString.charAt(6) - '0') * 2 +
        (bitString.charAt(7) - '0') * 1;

        return result + toHexChar(value);
    }
    // Converts integer to a single hex digit in a character
    public static char toHexChar(int hexValue) {
        if (hexValue >= 0 && hexValue <= 9)
            return (char)(hexValue + '0');
        else
            return (char)(hexValue - 10 + 'A');
    }

    public static String getBits(int value) {
        String result = "";

        int mask = 1;
        for (int i = 7; i >= 0; i--) {
            int temp = value >> i;
            int bit = temp & mask;
            result = result + bit;
        }
        return result;
    }
}

