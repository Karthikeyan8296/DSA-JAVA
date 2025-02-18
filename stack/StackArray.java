package stack;

public class StackArray {
    int size = 1000;
    int arr[] = new int[size];
    int top = -1;

    public void push(int x) {
        top++;
        arr[top] = x;
    }

    public int pop() {
        int x = arr[top];
        top--;
        return x;
    }

    public int peek() {
        return arr[top];
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        for (int i = 0; i < top + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}