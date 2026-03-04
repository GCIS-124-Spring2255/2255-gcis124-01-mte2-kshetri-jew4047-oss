// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

// import java.util.LinkedList;
// import java.util.Iterator;

public class MyDeque {
 public class MyDeque<E> implements Deque<E> {
     private int size;
     private final LinkedList<E> list;
     public MyDeque() {    list = new LinkedList<>();   size = 0; }

   public void enqueueFront(E element){
        if(this.size == list.length){
            list.copyOf(this.size * 2);
        }
        list.append(element, this.size);
   }

   public void enqueueBack(E elemant){
     if(this.size == list.length){
            list.copyOf(this.size * 2);
        }
        list.append(element, 0);
   }
   

   public E dequeueFront(E elemant){
     remove = list
   }

    // ... for dequeueBack ... 

    public int size(){
        return this.size;
    }

    public Iterator<E> Iterator(){

    }


    public static void main(String[] args) { 

        // ...
    }
}