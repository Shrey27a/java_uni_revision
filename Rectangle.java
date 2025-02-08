// default constructor 
public class Rectangle {
    int length; 
    int width;  

    // Default constructor
    public Rectangle() {
        length = 10; 
        width = 5;   
    }

    // Method to calculate the area of the rectangle
    public int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        // Create an object of the Rectangle class
        Rectangle rect = new Rectangle();

        // Print the dimensions of the rectangle
        System.out.println("Length of the rectangle: " + rect.length);
        System.out.println("Width of the rectangle: " + rect.width);

        
        System.out.println("Area of the rectangle: " + rect.calculateArea());
    }
}

    
