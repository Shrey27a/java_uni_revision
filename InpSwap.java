import java.util.Scanner;
public class InpSwap {
    public static void main(String[] args){
        Scanner Obj1 = new Scanner (System.in);
        System.out.println("ENter the value of a : ");
        int a = Obj1.nextInt();
        System.out.println("ENter the value of b : ");
        int b = Obj1.nextInt();


int temp = a;
            a = b;
            b = temp;
    
            System.out.println("After swap");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
    }
    
    
}
