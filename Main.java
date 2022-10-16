package Module9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       //Task 1 check
        System.out.println("Task 1\n");
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(5);
        myArrayList.add(12);
        myArrayList.add(25);
        myArrayList.add(21);
        System.out.println("Size of list: " + myArrayList.size());
        System.out.println("Element at index 1: " + myArrayList.get(1));
        myArrayList.remove(1);
        System.out.println("Element at index 1 after removing: " + myArrayList.get(1));
        System.out.println("Size of list after removing: " + myArrayList.size());
        myArrayList.clear();
        System.out.println("Size of list after clearing: " + myArrayList.size());

        System.out.println("\nNow with Strings\n");

        MyArrayList<String> myArrayList1 = new MyArrayList<>();
        myArrayList1.add("Alice");
        myArrayList1.add("Bob");
        myArrayList1.add("Carl");
        System.out.println("Size of list: " + myArrayList1.size());
        System.out.println("Element at index 0: " + myArrayList1.get(0));
        myArrayList1.remove(0);
        System.out.println("Element at index 0 after removing: " + myArrayList1.get(0));
        System.out.println("Size of list after removing: " + myArrayList1.size());
        //End of task 1 check

        //Task 2 check
        System.out.println("\n\nTask 2\n");
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(17);
        myLinkedList.add(66);
        myLinkedList.add(48);
        System.out.println("Size of list: " + myLinkedList.size());
        System.out.println("Element at index 1: " + myLinkedList.get(1));
        myLinkedList.remove(1);
        System.out.println("Element at index 1 after removing: " + myLinkedList.get(1));
        System.out.println("Size of list after removing: " + myLinkedList.size());
        myLinkedList.clear();
        System.out.println("Size of list after clearing: " + myLinkedList.size());

        System.out.println("\nNow with Strings\n");

        MyLinkedList<String> myLinkedList1 = new MyLinkedList<>();
        myLinkedList1.add("Winter");
        myLinkedList1.add("Spring");
        myLinkedList1.add("Summer");
        myLinkedList1.add("Autumn");
        System.out.println("Size of list: " + myLinkedList1.size());
        System.out.println("Element at index 0: " + myLinkedList1.get(0));
        myLinkedList1.remove(0);
        System.out.println("Element at index 0 after removing: " + myLinkedList1.get(0));
        System.out.println("Size of list after removing: " + myLinkedList1.size());
        //End of task 2 check

        //Task 3 check
        System.out.println("\n\nTask 3\n");
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.add(11);
        myQueue.add(52);
        myQueue.add(37);
        System.out.println("Size of queue: " + myQueue.size());
        System.out.println("First element: " + myQueue.poll());
        System.out.println("First element after polling: " + myQueue.peek());
        System.out.println("Size of queue after polling: " + myQueue.size());
        myQueue.clear();
        System.out.println("Size of queue after clearing: " + myQueue.size());

        System.out.println("\nNow with Strings\n");

        MyQueue<String> myQueue1 = new MyQueue<>();
        myQueue1.add("Monday");
        myQueue1.add("Tuesday");
        myQueue1.add("Wednesday");
        myQueue1.add("Thursday");
        System.out.println("Size of queue: " + myQueue1.size());
        System.out.println("First element: " + myQueue1.poll());
        System.out.println("First element after polling: " + myQueue1.peek());
        System.out.println("Size of queue after polling: " + myQueue1.size());
        //End of task 3 check

        //Task 4 check
        System.out.println("\n\nTask 4\n");
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(83);
        myStack.push(26);
        myStack.push(7);
        System.out.println("Size of stack: " + myStack.size());
        System.out.println("First element: " + myStack.pop());
        System.out.println("First element after popping: " + myStack.peek());
        System.out.println("Size of stack after popping: " + myStack.size());
        myStack.clear();
        System.out.println("Size of stack after clearing: " + myStack.size());

        System.out.println("\nNow with Strings\n");

        MyStack<String> myStack1 = new MyStack<>();
        myStack1.push("January");
        myStack1.push("February");
        myStack1.push("March");
        myStack1.push("April");
        System.out.println("Size of stack: " + myStack1.size());
        System.out.println("First element: " + myStack1.pop());
        System.out.println("First element after popping: " + myStack1.peek());
        System.out.println("Size of stack after popping: " + myStack1.size());
        //End of task 4 check

        //Task 5 check
        System.out.println("\n\nTask 5\n");

        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("January", 31);
        myHashMap.put("February", 28);
        myHashMap.put("March", 31);
        myHashMap.put("April", 30);
        System.out.println("Amount of months: " + myHashMap.size());
        System.out.println("Getting days of February: " + myHashMap.get("February"));
        myHashMap.put("February", 29);
        System.out.println("Getting days of February after changing: " + myHashMap.get("February"));
        System.out.println("Days of removed February: " + myHashMap.remove("February"));
        System.out.println("Amount of months after removing February: " + myHashMap.size());
        System.out.println("Getting days of removed February: " + myHashMap.get("February"));
        myHashMap.clear();
        System.out.println(myHashMap.size());
        //End of task 5 check

    }
}