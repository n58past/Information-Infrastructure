import java.util.Arrays;

public class ten_twentyfive {
    public static void main(String[] args){
        // Split the string using delimters
        String[] array = split("a?b?gf#e", "[?#]");
        // Display
        System.out.println(Arrays.toString(array));
    }

    public static String[] split(String s, String regex) {
        // Get delimers from regex
        String[] delimiters = getDelimiters(regex);
        // Initialize array for split strings
        String[] splitStrings = new String[s.length()];
        StringBuilder stringBuilder = new StringBuilder(s);
        int position = 0;

        // Continue until the string is fully split
        while (stringBuilder.length() > 0) {
            // If the string does not contain any more delimiters, add the rest of the string as the final substring
            if (!containsDelimiters(stringBuilder, delimiters)) {
                splitStrings[position++] = stringBuilder.toString();
                break;
            }
            // Find the position of the next delimiter
            int minIndex = stringBuilder.length();
            int delimiterLength = 1;
            for (String delimiter : delimiters) 
            {
                int index = stringBuilder.indexOf(delimiter);
                if (index == 0) {
                    minIndex = 0;
                    break;
                }
                else if (index > 0 && index < minIndex) {
                    minIndex = index;
                    delimiterLength = delimiter.length();
                }
            }
            if (minIndex != 0) splitStrings[position++] = stringBuilder.substring(0, minIndex);
            splitStrings[position++] = stringBuilder.substring(minIndex, minIndex + delimiterLength);
            stringBuilder.delete(0, minIndex + delimiterLength);
        }
        String[] array = new String[position];
        System.arraycopy(splitStrings, 0, array, 0, position);
        return array;
    }

    // Check if string has delimeters
    private static boolean containsDelimiters(StringBuilder s, String[] delimiters) {
        boolean hasDelimiters = false;
        for (String delimiter : delimiters) {
            hasDelimiters |= s.indexOf(delimiter) >= 0;
        }
        return hasDelimiters;
    }

    // Retrieve delimeters from string
    private static String[] getDelimiters(String regex) {
        int bracketStart = regex.indexOf('[');
        int bracketEnd = regex.indexOf(']');
        int lastPosition = regex.length() - 1;
        String[] delimiters;
        if (bracketStart == 0 && bracketEnd == lastPosition) {
            delimiters = new String[(bracketEnd - bracketStart - 1)];
            for (int i = 0; i < regex.length() - 2; i++) {
                delimiters[i] = "" + regex.charAt(i + 1);
            }
        } else {
            delimiters = new String[1];
            delimiters[0] = regex;
        }
        return delimiters;
    }
}