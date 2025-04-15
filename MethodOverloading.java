class MathOperation {
    int add(int a) {
        return a + 10;
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MathOperation obj1 = new MathOperation();

        System.out.println("Sum with one parameter : " + obj1.add(5));
        System.out.println("Sum with two parameters : " + obj1.add(5, 10));
        System.out.println("Sum with three parameters : " + obj1.add(5, 10, 15));
    }
}
