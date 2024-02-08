import java.net.URL;
import java.util.Scanner;
import java.util.ArrayList;

public class twelve_thirtythree{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL for search: ");
        String url = input.nextLine();
        System.out.print("Enter a word for search: ");
        String word = input.nextLine();
        crawler(url, word); // Traverse the Web from the a starting url
    }

    public static void crawler(String startingURL, String word) { 
        ArrayList<String> listOfPendingURLs = new ArrayList<String>(); 
        ArrayList<String> listOfTraversedURLs = new ArrayList<String>();

        listOfPendingURLs.add(startingURL); 
        while (!listOfPendingURLs.isEmpty() &&
              listOfTraversedURLs.size() <= 100) {
            String urlString = listOfPendingURLs.remove(0); 
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString); 
                System.out.println("Crawl " + urlString);
                if (contains(urlString, word)) {
                    System.out.println("The URL " + urlString + " contains the word " + word);
                    System.out.println("The number of pages been searched is " + listOfTraversedURLs.size());
                    break;
                }
                for (String s: getSubURLs(urlString)) { 
                    if (!listOfTraversedURLs.contains(s))
                        listOfPendingURLs.add(s);
                }
            }
        }
    }

    public static boolean contains(String urlString, String word) {
        try {
            URL url = new URL(urlString);

            try (Scanner input = new Scanner(url.openStream())) {
                while (input.hasNext()) {
                    String line = input.nextLine();
                    if (line.indexOf(word) > 0)
                        return true;
                }
            }
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return false;
    }

    public static ArrayList<String> getSubURLs(String urlString) { 
        ArrayList<String> list = new ArrayList<String>();

        try {
            URL url = new URL(urlString); 
            
            try (Scanner input = new Scanner(url.openStream())) {; 
                int current = 0;
                while (input.hasNext()) {
                    String line = input.nextLine();
                    current = line.indexOf("https:", current); 
                    while (current > 0) {
                        int endIndex = line.indexOf("\"", current);
                        if (endIndex > 0) { // Ensure that a correct URL is found
                            list.add(line.substring(current, endIndex)); 
                            current = line.indexOf("https:", endIndex);
                        }
                        else;
                            current = -1;
                    }
                }
            }
        }
    catch (Exception ex) {
        System.out.println("Error: " + ex.getMessage());
    }

    return list;
    }
}