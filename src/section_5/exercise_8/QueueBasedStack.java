package section_5.exercise_8;

import section_5.exercise_2.ArrayBasedQueue;
import section_5.exercise_2.FullQueueException;

public class QueueBasedStack {
private ArrayBasedQueue firstQueue ;
private ArrayBasedQueue secondQueue ;
private int size;
private int numberOfItems;

    public QueueBasedStack(int size) {
        this.size = size;
        this.firstQueue = new ArrayBasedQueue(size);
        this.secondQueue = new ArrayBasedQueue(size);
    }

    public void add(int number){
        if (numberOfItems == size)
            throw new FullQueueException();

        if (firstQueue.isEmpty())
            secondQueue.enqueue(number);
        else
            firstQueue.enqueue(number);

        numberOfItems++;
    }

    public int peek(){
        return findTopItem();
    }

    public int pop(){
        int topItem = findTopItem();
        removeTopItem();
        numberOfItems--;
        return topItem;
    }

    public void print(){
         if (firstQueue.isEmpty())
            secondQueue.print();
         else
             firstQueue.print();
    }

    private void removeTopItem() {
        if (firstQueue.isEmpty()){
            if (secondQueue.isEmpty())
                throw new IllegalArgumentException();   //stack is empty
            for (int i = 1; i< numberOfItems; i++){
                firstQueue.enqueue(secondQueue.dequeue());
            }
        }
        else {
            for (int i = 1; i< numberOfItems; i++){
                secondQueue.enqueue(firstQueue.dequeue());
            }
        }
    }

    private int findTopItem() {
        int topItem = 0;

        if (firstQueue.isEmpty()){
            if (secondQueue.isEmpty())
                throw new IllegalArgumentException();   //stack is empty
            while (!secondQueue.isEmpty()){
                topItem = secondQueue.dequeue();
                firstQueue.enqueue(topItem);
            }
        }
        else {
            while (!firstQueue.isEmpty()){
                topItem = firstQueue.dequeue();
                secondQueue.enqueue(topItem);
            }
        }
        return topItem;
    }
}
