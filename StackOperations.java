import java.util.Scanner;
import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println("Popped: " + stack.pop());
                    } else {
                        System.out.println("Stack is empty!");
                    }
                    break;
                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println("Top element: " + stack.peek());
                    } else {
                        System.out.println("Stack is empty!");
                    }
                    break;
                case 4:
                    System.out.println("Stack elements: " + stack);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 5);

        sc.close();
    }
}
 
