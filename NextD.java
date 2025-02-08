import java.util.Scanner;

public class NextD {
    
    
     public static void main(String[] args){
     
        Scanner myObj = new Scanner (System.in);
        System.out.println("Enter Salary:");

        double salary = myObj.nextDouble();
        System.out.println("The entered Salary is : " + salary);
    }
}
