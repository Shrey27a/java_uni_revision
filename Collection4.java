//Take a list of Integer elements and will display all the even elements existing in the list.

import java.util.*;
public class Collection4{
    public static void main(String[] args) {
    
    List<Integer> obj = new ArrayList<>();

    obj.add(5);
    obj.add(9);
    obj.add(24);
    obj.add(36);
    obj.add(6);
    obj.add(77);
    obj.add(59);

    System.out.println("Even numbers in the list are : ");
    for(Integer n : obj){
        if(n%2 == 0)
        {System.out.println(n + " "); }
    }
  }
}
