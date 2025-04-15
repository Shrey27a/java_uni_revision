// Take a list of multiple fruits and wherever kiwi is there replace it with cherry
import java.util.*;

public class Collection3 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        
        fruits.add("Kiwi");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Papaya");
        fruits.add("Kiwi");
        fruits.add("PineApple");
        fruits.add("Kiwi");

        
        if (fruits.contains("Kiwi")) {
            for (int i = 0; i < fruits.size(); i++) {
                if (fruits.get(i).equals("Kiwi")) {
                    fruits.set(i, "Cherry");
                }
            }
        }

        
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

