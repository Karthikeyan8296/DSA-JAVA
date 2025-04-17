import java.util.*;
import stack.StackArray;
import linkedlist.*;
import arrays.*;
import trees.*;

class Main {
    public static void main(String[] args) {
        // stack using arrays
        StackArray stackArray = new StackArray();
        stackArray.push(10);
        stackArray.push(14);
        stackArray.push(3);
        stackArray.push(9);
        stackArray.push(5);
        stackArray.pop();
        stackArray.display();
        System.out.println();
        System.out.println("Stack size: " + stackArray.size());
        System.out.println("Stack is empty: " + stackArray.isEmpty());
        System.out.println("Stack last value: " + stackArray.peek());

        // Linked list
        Basic linkedList = new Basic();
        linkedList.implementation();
        // Traversal
        Traversal linkedListTraversal = new Traversal();
        linkedListTraversal.input();

        System.out.println("\nInserting at start");

        // Inserting at start
        InsertionAtStart IasInstance = new InsertionAtStart();
        IasInstance.input();

        System.out.println("\nInserting at end");

        // Inserting at end
        InsertionAtEnd IaeInstance = new InsertionAtEnd();
        IaeInstance.input();

        System.out.println("\nInserting at position");

        // Inserting at position
        InsertionAtPosition IapInstance = new InsertionAtPosition();
        IapInstance.input();

        System.out.println("\nARRAY PROBLEMS");

        // Arrays
        // Easy Problems
        EasyProblems easyProblems = new EasyProblems();
        easyProblems.Second_Largest_Problem();
        easyProblems.Third_Largest_Problem();
        easyProblems.MaxProductOfTriplet();
        easyProblems.MaximumProduct();
        easyProblems.MaxConsecutives();
        easyProblems.MoveAllZero();
        easyProblems.ReverseGroup();
        easyProblems.leftRotation();
        easyProblems.rightRotation();
        easyProblems.leftRotationKthValue();
        easyProblems.rightRoatationKthValue();
    }
}