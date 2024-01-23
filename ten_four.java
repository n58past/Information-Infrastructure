public class ten_four {
    public static void main(String[] args){
        // Test points
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);
        
        // Display results
        double Distance = point1.getDistance(point2);
		System.out.printf("The distance between point (0,0) and (10, 30.5) is %.4f%n", Distance) ;
    }
}

class MyPoint{
    // Initalize values
    private double x,y;

    // Constructore
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    // Return values
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    // Activates getdistance method 
    public double getDistance(MyPoint myPoint) {
        return (Distance(myPoint.getX(), myPoint.getY()));
    }

    // Finds distance between two points object
    public double Distance(MyPoint newPoint) {
        return Math.sqrt((Math.pow(newPoint.getX() - this.x, 2) 
            + Math.pow(newPoint.getY() - this.y, 2)));
    }

    // Gets distance between a point object and point
    public double Distance(double newX, double newY) {
        return Math.sqrt((Math.pow(this.x - newX, 2) 
            + Math.pow(this.y - newY, 2)));
    }
}