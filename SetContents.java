import java.util.Set;
import java.util.HashSet;

public class SetContents{
    public static void main(String[] args) {
        Set <String> fruits = new HashSet<> ();

        fruits.add ("Apple");
        fruits.add ("Mango");
        fruits.add ("Cherry");
        fruits.add ("Guava");
        fruits.add ("Orange");

        System.out.println("Fruits in set are:");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
    
} 