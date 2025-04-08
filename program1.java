
import mypackage.arithmetic;
public class program1 {
    public static void main(String [] args)
    {
        arithmetic obj=new arithmetic();
        System.out.println(obj.add(7,9));

        arithmetic obj1=new arithmetic();
        System.out.println(obj1.sub(7,9));

        arithmetic obj2=new arithmetic();
        System.out.println(obj2.mul(7,9));

        arithmetic obj3=new arithmetic();
        System.out.println(obj3.div(3,15));

        arithmetic obj4=new arithmetic();
        System.out.println(obj4.modu(7,9));
    }
    
}


