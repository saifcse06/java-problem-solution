package stack;

import java.util.Scanner;
import java.util.Stack;

public class ExampleStack {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Stack<String> myStack = new Stack();
        // myStack.push("Babu");
        // myStack.push("Saif");
        // // myStack.push("Romana");
        // System.out.println("Remove Pop item:" + myStack.pop());
        // System.out.println("Get peek item:" + myStack.peek());
        // System.out.println("Get test item:" + myStack.size());

        Stack s = new Stack();
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n******** MENU *******");
            System.out.println("\n1.PUSH");
            System.out.println("\n2.POP");
            System.out.println("\n3.PEEK");
            System.out.println("\n4 IS EMPTY");
            System.out.println("\n5.EXIT");
            System.out.println("\n enter ur choice : ");
            switch (in.nextInt()) {
                case 1:
                    System.out.println("\nenter the value ");
                    s.push(in.nextInt());
                    break;
                case 2:
                    System.out.println("\n popped element : " + s.pop());
                    break;

                case 3:
                    System.out.println("\n top element : " + s.peek());
                    break;
                case 4:
                    System.out.println("\n is empty : " + s.isEmpty());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n Wrong Choice!");
                    break;
            }
            System.out.println("\n do u want to cont... ");
        } while (in.nextInt() == 1);

    }
}
