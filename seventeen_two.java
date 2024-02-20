import java.io.*;
import java.util.Random;

public class seventeen_two {
    public static void main(String[] args) throws IOException { 
        Random rand = new Random();
        try (
            // Create an output stream to the file
            DataOutputStream output = 
                new DataOutputStream(new FileOutputStream("Exercise17_02.dat", true)); 
        ) {
            // Output values to the file
            for (int i = 0; i < 100; i++){
                output.writeInt(rand.nextInt(100000));
            } 
        }
        System.out.println("Dat file created");
    }
}