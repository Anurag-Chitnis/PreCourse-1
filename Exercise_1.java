// Time Complexity:
// Space Complexity: O(N)
// Did this code successfully run on Leetcode : N/A
// I don't see leetcode link to this problem 
// Any problem you faced while coding this:

// Your code here along with comments explaining your approach
class Stack {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == MAX - 1;
    }

    boolean push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return false;
        }
        top++;
        a[top] = x;
        return true;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int temp = a[top];
        top -= 1;
        return temp;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return -1;
        }

        return a[top];
    }
;

}

// Driver code 
class Main {

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
