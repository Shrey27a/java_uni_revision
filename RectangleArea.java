//by using constructor +by making objects 
import java.util.Scanner;

class AreaRec {
    double length, width;

    // Constructor to initialize the rectangle
    AreaRec(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    double calculateArea() {
        return length * width;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        
        AreaRec rect = new AreaRec(length, width);

        
        System.out.println("The area of the rectangle is: " + rect.calculateArea());

        scanner.close();
    }
}

