class abc{
    public final void display(){
        System.out.println("final method");
    }
}
class def extends abc{
/* @Override 
    public void display(){
        System.out.println("Trying to override final ");
    }
        */
        
}

public class Mainn{
    public static void main(String[] args) {
        abc obj = new abc();
        obj.display();

    }
}