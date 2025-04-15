import cmath.Addition;
import cmath.Subtraction;

public class Main {
    public static void main(String[] args) {
        Addition addObj = new Addition();
        Subtraction subObj = new Subtraction();

        int a = 15, b = 5;

        System.out.println("Addition: " + addObj.add(a, b));
        System.out.println("Subtraction: " + subObj.sub(a, b));
    }
}
 