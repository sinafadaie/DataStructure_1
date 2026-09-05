package section_5.exercise_7;

import section_3.exercise_2.LinkedList;
import section_3.exercise_2.Node;
import section_5.exercise_2.FullQueueException;

//we build a Queue data structure
//based on the linked-list we built in section_3

public class LinkedListBasedQueue {
   private LinkedList linkedList = new LinkedList();
   private int size;
   private int numberOfItems;

    public LinkedListBasedQueue(int size) {
        this.size = size;
    }

    public void enqueue(int number){
        if (numberOfItems == size)
            throw new FullQueueException();

       linkedList.addLast(number);
       numberOfItems++;
   }

   public int dequeue(){
        if (numberOfItems == 0)
            throw new IllegalArgumentException();

       Node firstItem = linkedList.getFirst();
       linkedList.deleteFirst();
       numberOfItems--;

       return firstItem.getValue();
   }

   public int peek(){
        return linkedList.getFirst().getValue();
   }

   public boolean isEmpty(){
        return numberOfItems == 0;
   }

   public boolean isFull(){
        return numberOfItems == size;
   }

   public void print(){
        linkedList.print();
   }
}
