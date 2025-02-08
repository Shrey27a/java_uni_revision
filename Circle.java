class Find {
    double r;

    public Find(double r1) {
        r = r1;
    }

    double area() {
        return (3.14 * r * r);
    }

    double circumference() {
        return (2 * 3.14 * r);
    }
}

public class Circle {
    public static void main(String[] args) {
        Find obj = new Find(5);
        System.out.println(obj.area());
        System.out.println(obj.circumference());
    }
} 