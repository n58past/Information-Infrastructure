public class four_three {
    public static void main(String[] args){
        // Distance between two points \sqrt((x2-x1)^2+(y2-y1)^2)

        // Vertices of first triangle
        //      Atlanta (33.7489954, -84.3879824)
        //      Orlando (28.5383355, -81.3792365)
        //      Charlotte (35.2270869, -80.8431267)

        // Vertices of second triangle
        //      Savannah (32.0835407, -81.0998342)
        //      Orlando (28.5383355, -81.3792365)
        //      Charlotte (35.2270869, -80.8431267)

        // Sides of first triangle, C for both triangles
        Double A = Math.sqrt(Math.pow((33.7489954 - 28.5383355), 2) + Math.pow(-84.3879824 + 81.3792365 , 2));
        Double B = Math.sqrt(Math.pow((33.7489954 - 35.2270869), 2) + Math.pow(-84.3879824 + 80.8431267 , 2));
        Double C = Math.sqrt(Math.pow((28.5383355 - 35.2270869), 2) + Math.pow(-81.3792365 + 80.8431267 , 2));

        // Second triangle
        Double X = Math.sqrt(Math.pow((32.0835407 - 28.5383355), 2) + Math.pow(-81.0998342 + 81.3792365 , 2));
        Double Y = Math.sqrt(Math.pow((32.0835407 - 35.2270869), 2) + Math.pow(-81.0998342 + 80.8431267 , 2));

        // Calculate the area of the first triangle
        Double s_1 = (A + B + C) / 2.0;
        Double area_1 = Math.sqrt(s_1 * (s_1 - A) * (s_1 - B) * (s_1 - C));

        // Calculate the area of the first triangle
        Double s_2 = (X + Y + C) / 2.0;
        Double area_2 = Math.sqrt(s_2 * (s_2 - X) * (s_2 - Y) * (s_2 - C));

        // Combine for total area and round
        Double total_area = Math.round((area_1 + area_2) * 100000000) / 100000000.0;

        // Display answer
        System.out.println("The total area between the cities is " + total_area);
    }
}

//(Hint: Use the formula in Programming Exercise 4.2 to compute the 
//distance between two cities. Divide the polygon into two triangles and use the formula in 
//Programming Exercise 2.19 to compute the area of a triangle.)
