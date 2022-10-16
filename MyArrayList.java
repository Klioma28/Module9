package Module9;

public class MyArrayList <E> {
    int size = 0;

    E[] list = (E[]) new Object[0];

    public void add (E value){
        size++;   //increasing size of list
        E[] new_list = (E[]) new Object[size];
        //rewriting old list to new
        for (int i = 0; i < size -1; i++){
            new_list[i] = list[i];
        }
        new_list[size -1] = (E) value;  //adding new value to the end of the list
        list = new_list;  //setting new list
    }

    public void remove (int index){
        size--;    //decreasing size of list
        E[] new_list = (E[]) new Object[size];

        boolean flag = false;   //flag to check if we met element, that we need to remove
        //rewriting old list to new
        for (int i = 0; i <= size; i++){
            if (flag) new_list[i-1] = list[i];  //rewriting all other elements, after we met element we need to remove
            else if (i != index) new_list[i] = list[i];  //rewriting elements before we met element we need to remove
            else flag = true;   //changing flag value when we met element we need to remove
        }
        list = new_list;  //setting new list
    }

    public void clear (){
        list = ((E[]) new Object[0]);   //recreating new empty list
        size = 0;  //setting size of list to 0
    }

    public int size(){ return size; }

    public E get(int index){ return list[index]; }
}
