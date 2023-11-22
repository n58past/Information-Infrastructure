public class seven_twentynine {
   
    public static void main(String[] args) {
        int[] deck = new int[52];

        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        // Initialize count
        int count = 0;
        int sum = 0;

        // Continue picking four cards till sum
        do {
            int card_1_Value = (deck[(int)(Math.random() * 52)] % 13) + 1;
            int card_2_Value = (deck[(int)(Math.random() * 52)] % 13) + 1;
            int card_3_Value = (deck[(int)(Math.random() * 52)] % 13) + 1;
            int card_4_Value = (deck[(int)(Math.random() * 52)] % 13) + 1;

            sum = (card_1_Value + card_2_Value + card_3_Value + card_4_Value);
            count++;
        } while (sum != 24);

        // Display the result
        System.out.println("Number of picks that gives the sum of 24: " + count);
    }
}