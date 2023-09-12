public class one_eleven {
    public static void main(String[] args){
        // Current population 312,032,486
        double year_one = 312032486;

        // Seconds in one year
        double year_seconds = (365 * 24 * 60 * 60);
        
        // One birth every 7 seonds, one death every 13 seconds, one new immigrant every 45 seconds.
        // Let x = seconds in one year. Then first year population change is equal to 
        // x/7 + x/45 - x/13 = 361x/4095
        // Change in yearly population
        double year_pop_change = (361 * year_seconds)/4095.0;
        
        // Outputs the population each year

        System.out.println("Current Population(Year 0): 312032486");

        System.out.print("Year 1 Population: " );
        System.out.println((int)(year_pop_change + year_one));

        System.out.print("Year 2 Population: " );
        System.out.println((int)(year_pop_change * 2 + year_one));

        System.out.print("Year 3 Population: " );
        System.out.println((int)(year_pop_change * 3 + year_one));

        System.out.print("Year 4 Population: " );
        System.out.println((int)(year_pop_change * 4 + year_one));

        System.out.print("Year 5 Population: " );
        System.out.println((int)(year_pop_change * 5 + year_one));
    }
}
