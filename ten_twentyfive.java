public class ten_twentyfive {
    public static void main(String[] args){
        // Split the string using delimters
        String[] stringArray1 = split("ab#12#453", "#");
        // Display each item
        for (String item : stringArray1) {
            System.out.print(item + ", ");
        }
        System.out.println();
        // Split the string using delimters
        String[] stringArray2 = split("a?b?gf#e", "[?#]");
        // Display each item
        for (String item : stringArray2) {
            System.out.print(item + ", ");
        }
    }

    public static String[] split(String startString, String regex) {
        // Get delimers from regex
        String[] delimiters = getDelimiters(regex);

        // Create array for split strings
        String[] splitString = new String[startString.length()];
        StringBuilder stringBuilder = new StringBuilder(startString);

        int start = 0;

        // Continue until the string is fully split
        while (stringBuilder.length() > 0) {
            // If the string does not contain any more delimiters,
            // add the rest of the string as the final substring

            if (!containsDelimiters(stringBuilder, delimiters)) {
                splitString[start++] = stringBuilder.toString();
                break;
            }

            // Find the position of the next delimiter
            int minIndex = stringBuilder.length();
            int delimLength = 1;
            for (String delim : delimiters) 
            {
                int index = stringBuilder.indexOf(delim);
                if (index == 0) {
                    minIndex = 0;
                    break;
                }
                else if (index > 0 && index < minIndex) {
                    minIndex = index;
                    delimLength = delim.length();
                }
            }
            // Add the substring before the delimiter and the delimiter to the result
            if (minIndex != 0) 
                splitString[start++] = stringBuilder.substring(0, minIndex);
            
            splitString[start++] = stringBuilder.substring(minIndex, minIndex + delimLength);

            // Remove used section from the string
            stringBuilder.delete(0, minIndex + delimLength);
        }
        
        // Create correct sized array
        String[] stringArray = new String[start];
        System.arraycopy(splitString, 0, stringArray, 0, start);

        return stringArray;
    }

    // Check if string has delimeters
    private static boolean containsDelimiters(StringBuilder startString, String[] delimiters) {
        boolean hasDelimiters = false;
        for (String delim : delimiters) {
            if (startString.indexOf(delim) >= 0) {
                hasDelimiters = true;
                break;
            }
        }
        return hasDelimiters;
    }

    // Retrieve delimeters from string
    private static String[] getDelimiters(String regex) {
        String[] delimiters = new String[regex.length()];
        for (int i = 0; i < regex.length(); i++) {
            delimiters[i] = "" + regex.charAt(i);
        }
        return delimiters;
    }
}