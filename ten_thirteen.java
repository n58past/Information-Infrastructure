public class ten_thirteen {
    public static void main(String[] args){
        // Create two rectangle objects
        MyRectangle2D rectangle1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        MyRectangle2D rectangle2 = new MyRectangle2D(4, 5, 10.5, 3.2);

        // Display results
        System.out.println("Rectangle details:");
        System.out.printf("Area: %.2f%n ", rectangle1.getArea());
        System.out.printf("Perimeter: %.2f%n ", rectangle1.getPerimeter());
        if (rectangle1.contains(3, 3))
            System.out.println("Does contain (3,3)");
        else
            System.out.println("Does not contain (3,3)");
        
        if (rectangle1.contains(rectangle2))
            System.out.println("Does contain rectangle 2 with values (4, 5, 10.5, 3.2)");
        else
            System.out.println("Does not contain rectangle 2 with values (4, 5, 10.5, 3.2)");

        if (rectangle1.overlaps(rectangle2))
            System.out.println("Does overlap with rectangle 2 with values (4, 5, 10.5, 3.2)");
        else
            System.out.println("Does not overlap with rectangle 2 with values (4, 5, 10.5, 3.2)");

            

}

static class MyRectangle2D {
    // Initialize values
    public double x,y;
    public double width, height;
    
    // Retrieve values
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    // Set values
    public void setX(double newX) {
        this.x = newX;
    }

    public void setY(double newY) {
       this.y = newY;
    }

    // Retrieve width and height
    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    // Set width and height
    public void setWidth(double newWidth) {
       this.width = newWidth;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    // Constructor for retangle object
    MyRectangle2D() {
        x = 0;
        y = 0;
        width = 1.0;
        height = 1.0;
    }

    MyRectangle2D(double newX, double newY, double newWidth, double newHeight){
        x = newX;
        y = newY;
        width = newWidth;
        height = newHeight;
    }

    // Get area and perimeterr
    public double getArea() {
        return(width * height);
    }

    public double getPerimeter() {
        return(width * 2 + height * 2);
    }

    // Determine if contains point
    public boolean contains(double x, double y) {
		return getDistance(this.y, y) <= height / 2 && 
				 getDistance(this.x, x) <= width / 2; 
    }

    // Determines if rectangle is within rectangle entirley
    public boolean contains(MyRectangle2D rectangle) {
		return 
			getDistance(this.y, rectangle.getY()) + rectangle.getHeight() / 2 <= this.height / 2 && 
		 	getDistance(this.x, rectangle.getX()) + rectangle.getWidth() / 2 <= this.width / 2 &&
			this.height / 2 + rectangle.getHeight() / 2 <= this.height &&
		 	this.width / 2 + rectangle.getWidth() / 2 <= this.width;
	}

    // Determines if rectanlge overlaps into other at all
	public boolean overlaps(MyRectangle2D rectangle) {
		return !contains(rectangle) &&
				 ((this.x + this.width / 2 > rectangle.getX() - rectangle.getWidth()) ||
				 (this.y + this.height / 2 > rectangle.getY() - rectangle.getHeight())) &&
		  		 (getDistance(this.y, rectangle.getY()) < this.height / 2 + rectangle.getHeight() / 2) && 
				 (getDistance(this.x, rectangle.getX()) < this.width / 2 + rectangle.getWidth() / 2);
	}

    // Finds distance between points for usage of contains and overlap
    private double getDistance(double point1, double point2){
        return Math.sqrt(Math.pow(point1 - point2, 2));
    }
}
}