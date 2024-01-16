// UML Diagram
//  _________________________
// |        Stopwatch        |
// |_________________________|
// | startTime:        Long  |
// | endTime:          Long  |
// | Stopwatch()             |
// | Start()                 |
// | Stop()                  |
// | getElapsedTime(): Long  |
// |_________________________|

public class nine_six {
    public static void main(String[] args){
        Stopwatch stopwatch = new Stopwatch();

        int[] randomArray = new int[100000];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int)(Math.random() * 100000);
		}

        stopwatch.start();

        selectionSort(randomArray);

        stopwatch.stop();
        
        System.out.println("The time elapsed for the slection sort was "
            + stopwatch.getElapsedTime() + " milliseconds");
    }

    public static void selectionSort(int[] list) { 
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length−1]
            int currentMin = list[i]; 
            int currentMinIndex = i;
            
            for (int j = i + 1; j < list.length; j++) { 
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            
            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) { 
                list[currentMinIndex] = list[i]; 
                list[i] = currentMin;
            }
        }
    }
}

class Stopwatch {
    // Stopwatch data
    private long startTime = System.currentTimeMillis();
    private long endTime;

    // Construct Stopwatch
    public Stopwatch() {
    }
    
    // Set start time
    public void start(){
        startTime = System.currentTimeMillis();
    }
    
    // Set end time
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    
    // Return the different between endTime and startTime
    // which is the elapsed time.
    public double getElapsedTime() {
        return endTime - startTime;
    }
}
