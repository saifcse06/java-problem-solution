package stack;

public class MyStack {
    int capacity = 3;
    int[] stack = new int[capacity];
    int top = -1;

    /**
     * @param x
     */
    void push(int x) {
        if (top < capacity - 1) {
            top = top + 1;
            stack[top] = x;
            System.out.println("stack add successfully: " + x);
        } else {
            System.out.println("Stack overfall for:" + x);
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("My Stack is under flow:" + top);
            return -1;
        }
        int val = stack[top];
        top = top - 1;
        return val;
    }

    int peek() {
        if (top < 0) {
            System.out.println("My Stack is under flow:" + top);
            return -1;
        }
        return stack[top];
    }

    public static void main(String[] args) {
        System.out.println("Stack Implemention:");
        MyStack obj = new MyStack();
        System.out.println("My Stack peek return" + obj.peek());
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        System.out.println("Remove my stack:" + obj.pop());
        System.out.println("My Stack peek return" + obj.peek());
    }
}
