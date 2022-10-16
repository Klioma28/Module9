package Module9;

public class MyStack<E> extends MyLinkedList<E> {
    public void push(E value){
        add(value);
    }

    public E peek(){
        Node<E> x = last;
        return x.item;
    }

    public E pop(){
        E item = last.item;
        remove(size-1);
        return item;
    }
}
