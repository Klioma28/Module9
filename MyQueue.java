package Module9;

public class MyQueue<E> extends MyLinkedList {
    public E peek(){
        Node<E> x = first;
        return x.item;
    }

    public E poll(){
        Node<E> x = first;
        remove(0);
        return x.item;
    }
}
