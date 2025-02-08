 class Rectangle {
    int l,b;
    int area(){
        return(l*b);
    }
}
public class RecArea {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.l=40;
        obj.b=66;
        System.out.println(obj.area());

    }
    
}
    

