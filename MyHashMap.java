package Module9;
import java.util.Objects;

public class MyHashMap<K,V> {
    int size = 0;
    Node<K,V> first;

    static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    Node<K,V> newNode(int hash, K key, V value, Node<K,V> next) {
        return new Node<>(hash, key, value, next);
    }

    public void put(K key, V value) {
        if (size == 0){ //creating first Node
            first = newNode(hash(key), key, value, null);
            size++;
        } else  putVal(hash(key), key, value);
    }

    protected final void putVal(int hash, K key, V value) {
        Node<K, V> f = first, node; K k;
        if (f.hash == hash &&   //If new Node key is the same as first Node of the Map - changing old value to new one
                ((k = f.key) == key || (key != null && key.equals(k))))
            f.value = value;
        else {
            while (true){
                if ((node = f.next) == null) {  //If You got to the end of Map and none of Nodes have the same key ->
                    f.next = newNode(hash, key, value, null);   //-> creating new Node at the end of the Map
                    size++;
                    break;
                }
                if (node.hash == hash &&    //If You found Node, that has the same key as new one - changing value ->
                        ((k = node.key) == key || (key != null && key.equals(k)))){ //->  of this Node to new one
                    node.value = value;
                    break;
                }
                f = node;
            }
        }
    }

    public V remove(Object key) {
        Node<K,V> e;
        return (e = removeNode(hash(key), key)) == null ?  //returns value of removed Node or null if Node wasn't found
                null : e.value;
    }

    protected final Node<K,V> removeNode(int hash, Object key) {
        Node<K,V> f = first;
        if (f != null && size > 0) {    //check if Map is not empty
            Node<K,V> node = null, e; K k;
            if (f.hash == hash &&   //check if first Node is one You need to remove
                    ((k = f.key) == key || (key != null && key.equals(k))))
                node = f;
            else if ((e = f.next) != null) {    //check all other Nodes
                    do {
                        if (e.hash == hash &&
                                ((k = e.key) == key ||
                                        (key != null && key.equals(k)))) {
                            node = e;
                            break;
                        }
                        f = e;
                    } while ((e = e.next) != null);
            }
            if (node != null) { //if Node was found returning it to remove method
                if (node == f)
                    first = node.next;  //if Node You needed to remove was first - setting next Node as new first
                else
                    f.next = node.next; //if not - linking Nodes, that were neighbour to removed one
                --size;
                return node;
            }
        }
        return null;
    }

    public void clear() {
        //clearing all nodes and their links
        for (Node<K, V> f = first; f != null; ) {
            Node<K, V> next = f.next;
            f.hash = 0;
            f.key = null;
            f.value = null;
            f = next;
        }
        first = null;
        size = 0;
    }

    public int size(){ return size; }

    public V get(Object key) {
        Node<K,V> e;
        return (e = getNode(hash(key), key)) == null ? null : e.value;  //returns value or null if Node wasn't found
    }

    final Node<K,V> getNode(int hash, Object key) {
        Node<K,V> f = first;
        Node<K,V> e; K k;
        if (f != null && size > 0) {
            if (f.hash == hash && //check if first Node is one You need to get
                    ((k = f.key) == key || (key != null && key.equals(k))))
                return f;
            if ((e = f.next) != null) { //checking all other Nodes
                do {
                    if (e.hash == hash &&
                            ((k = e.key) == key || (key != null && key.equals(k))))
                        return e;
                } while ((e = e.next) != null);
            }
        }
        return null;
    }

    static class Node<K,V> {
        int hash;
        K key;
        V value;
        Node<K,V> next;

        Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final K getKey()        { return key; }
        public final V getValue()      { return value; }
        public final String toString() { return key + "=" + value; }

        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public final boolean equals(Object o) {
            if (o == this)
                return true;
            if (o instanceof Node) {
                Node<?,?> e = (Node<?,?>)o;
                return Objects.equals(key, e.getKey()) &&
                        Objects.equals(value, e.getValue());
            }
            return false;
        }
    }
}
