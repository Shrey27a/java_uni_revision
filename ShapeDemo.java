// Interface
interface Shape {
    double area(); // abstract method to be implemented by all shapes
}

// Circle class implementing Shape
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

// Main class to demonstrate polymorphism
public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5); // Polymorphic reference
        Shape rectangle = new Rectangle(4, 6); // Polymorphic reference

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
