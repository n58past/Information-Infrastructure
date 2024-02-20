import java.io.*;

public class seventeen_two {
    public static void main(String[] args) throws IOException { 
        try (
            // Create an output stream to the file
            DataOutputStream output = 
                new DataOutputStream(new FileOutputStream("Exercise17_02.txt", true)); 
        ) {
            // Output values to the file
            for (int i = 0; i < 100; i++){
                output.write((int)(Math.random() * 100000));
            } 
        }
        System.out.println("Data file created");
    }
}