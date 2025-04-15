class Rectangle1 {
    int length, breadth;

    // Default constructor
    Rectangle1() {
        length = 1;
        breadth = 1;
    }

    // Parameterized constructor
    Rectangle1(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle1 rect1 = new Rectangle1(); // using default constructor
        Rectangle1 rect2 = new Rectangle1(5, 3); // using parameterized constructor

        System.out.println("Area of rectangle 1: " + rect1.area());
        System.out.println("Area of rectangle 2: " + rect2.area());
    }
}
 
