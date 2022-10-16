package Module9;

public class MyStack<E> extends MyLinkedList {
    public void push(E value){
        add(value);
    }

    public E peek(){
        Node<E> x = last;
        return x.item;
    }

    public E pop(){
        Node<E> x = last;
        remove(size-1);
        return x.item;
    }
}
