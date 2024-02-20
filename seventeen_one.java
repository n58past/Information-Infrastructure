import java.io.*;
import java.util.*;

public class seventeen_one {
    public static void main(String[] args) throws IOException { 
        try (
            // Create a file
            PrintWriter output = 
                new PrintWriter(new FileOutputStream("Exercise17_01.txt", true));
            ) {
            // Write formatted output to the file} 
            for (int i = 0; i < 100; i++){
                if (i < 99)
                    output.print((int)(Math.random() * 100000) + " ");
                else
                    output.print((int)(Math.random() * 100000));
            } 
        }
        System.out.println("Txt file created");
    }
}