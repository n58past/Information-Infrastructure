// UML Diagram
//  ___________________________________________
// |                   Stock                   |
// |-------------------------------------------|
// | symbol:               String              |
// | name:                 String              |
// | previousClosingPrice: double              |
// | currentPrice:         double              |
// | Stock()                                   |
// | Stock(newSymbol: String, newName: String) |
// | getChangePercent():   double              |
// |___________________________________________|


public class nine_two {
    public static void main(String[] args){
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        
        stock1.setPreviousClosingPrice(34.5);
        stock1.setCurrentPrice(34.35);

        System.out.println("Previous closing price: " 
            + stock1.getPreviousClosingPrice());
        System.out.println("Current price: "
            + stock1.getCurrentPrice());
        System.out.println("Price Change: "
            + stock1.getChangePercent() + "%");
    }
}

class Stock{
    // Stock Data
    String symbol;
    String name;

    double previousClosingPrice;
    double currentPrice;

    // Construct Stock
    public Stock() { 
    }

    // Construct a Stock object
    public Stock(String newSymbol, String newName) { 
        symbol = newSymbol;
        name = newName;
    }

    // Return the change percentage
    public double getChangePercent(){
        return((currentPrice - previousClosingPrice) / previousClosingPrice * 100);
    }

    // Return the Previous Closing Price
    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }

    // Return the Current Price
    public double getCurrentPrice(){
        return currentPrice;
    }

    // Set the Current Price
    public void setCurrentPrice(double newCurrentPrice){
        currentPrice = newCurrentPrice;
    }

    // Set the Previous Closing Price
    public void setPreviousClosingPrice(double newPreviousClosingPrice){
        previousClosingPrice = newPreviousClosingPrice;
    }
}
