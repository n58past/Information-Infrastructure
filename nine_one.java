// UML Diagram
//  _________________________________________________
// |                    Rectangle                    |
// |_________________________________________________|
// | width:          double                          |
// | height:         double                          |
// | Rectangle()                                     |
// | Rectangle(newWidth: double , newHeight: double) |
// | getArea():      double                          |
// | getPerimeter(): double                          |
// |_________________________________________________|

public class nine_one {
    public static void main(String[] args){
        Rectangle rec1 = new Rectangle(4, 40); 
        Rectangle rec2 = new Rectangle(3.5, 35.9); 

        System.out.println("Rectangle 1 \nWidth: " + rec1.width
            + "\nHeight: " + rec1.height + "\nArea: " + rec1.getArea()
            + "\nPerimeter: " + rec1.getPerimeter() + "\n");
        

        System.out.println("Rectangle 2 \nWidth: " + rec2.width
            + "\nHeight: " + rec2.height + "\nArea: " + rec2.getArea()
            + "\nPerimeter: " + rec2.getPerimeter());

    }
}

class Rectangle{
    /** The width of this rectangle */ double width = 1;
    /** The height of this rectangle */ double height = 1;

    /** Construct a rectangle */
    public Rectangle() {
    }
        
    /** Construct a rectangle object */
    public Rectangle(double newWidth, double newHeight) { 
        width = newWidth;
        height = newHeight;
    }
        
    /** Return the area of this rectangle */
    public double getArea() {
        return width * height;
    }
        
    /** Return the perimeter of this rectangle */
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
}