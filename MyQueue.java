package Module9;

public class MyQueue<E> extends MyLinkedList<E> {
    public E peek(){
        Node<E> f = first;
        return f.item;
    }

    public E poll(){
        E item = first.item;
        remove(0);
        return item;
    }
}
