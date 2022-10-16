package Module9;

public class MyLinkedList <E> {
    int size = 0;
    Node <E> first;
    Node <E> last;

    protected void linkFirst(E e) {
        Node<E> f = first; //buffering first Node
        Node<E> newNode = new Node<>(null, e, f);  //creating new Node and linking it to previous first Node
        first = newNode; //setting new Node as last
        if (f == null)  //if list is empty setting new Node as last
            last = newNode;
        else
            f.prev = newNode;   //if list is not empty linking previous first Node to new one
        size++;
    }

    void linkLast(E e) {
        Node<E> l = last; //buffering last Node
        Node<E> newNode = new Node<>(l, e, null); //creating new Node and linking it to previous Node
        last = newNode; //setting new Node as last
        if (l == null)  //if list is empty setting new Node as first
            first = newNode;
        else
            l.next = newNode;   //if list is not empty linking previous last Node to new one
        size++;
    }

    public void add (E value){
        if (size == 0) linkFirst(value); //adding first element if list is empty
        else linkLast(value);   //adding last element if list is not empty
    }

    public void remove(int index) {
        Node<E> x = first;  //setting x as first Node
        //searching Node you need to remove
        for (int i = 0; i < index; i++) {
            x = x.next;
        }

        E element = x.item;
        Node<E> next = x.next;
        Node<E> prev = x.prev;

        if (prev == null) {    //if you need to remove first element - setting next element as first
            first = next;
        } else {
            prev.next = next;   //linking previous element to next element
            x.prev = null;  //removing link between element we need to remove and previous element
        }

        if (next == null) {    //if you need to remove last element - setting previous element as last
            last = prev;
        } else {
            next.prev = prev;   //linking next element to previous element
            x.next = null;  //removing link between element we need to remove and next element
        }

        x.item = null;
        size--;
    }

    public void clear() {
        //clearing all nodes and their links
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        Node<E> x = first;  //setting x as first Node
        for (int i = 0; i < index; i++)   //searching Node in list
            x = x.next;
        return x.item;
    }

    protected static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}

