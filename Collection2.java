// by using enhanced for  loop
import java.util.*;
public class Collection2 {
    public static void main(String[] args) {
    Collection<Integer> obj = new ArrayList<>();
    obj.add(5);
    obj.add(8);
    obj.add(9);

    //System.out.println(obj);
    for (Integer n : obj){
        System.out.println(n);
    }
  }
}

/*
output is in
5
8
9

*/ 
