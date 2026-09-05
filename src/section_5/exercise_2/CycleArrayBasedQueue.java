package section_5.exercise_2;

import java.util.NoSuchElementException;

//we use Cycle Array instead of shifting!
//frontQueue/backQueue increase normally
//but the related index is calculated based on %
//so all the methods are O(1) now!
//Cycle Array is use % to find element index.

public class CycleArrayBasedQueue {
    private int[] array;
    private int frontQueue = 0;
    private int backQueue = -1;
    private int size;
    private int numberOfItems;

    public CycleArrayBasedQueue(int size) {
        this.array = new int[size];
        this.size = size;
    }

    public void enqueue(int number){        //O(1)
        if(isFull())
            throw new FullQueueException();

        backQueue++;
        array[backQueue % size] = number;
        numberOfItems++;
    }

    public Integer dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }

        int front = array[frontQueue % size ];
        frontQueue++;
        numberOfItems--;
        return front;
    }

    public Integer peek(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }

        numberOfItems--;
        return array[frontQueue];
    }

    public boolean isEmpty(){
        return backQueue < frontQueue;
    }

    public boolean isFull(){        //O(1)
        return numberOfItems == size;
    }

    public void print(){
        if (isEmpty()){
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (var i = frontQueue; i <= backQueue; i++){
            System.out.print(array[i % size]);
            if (i == backQueue) {
                System.out.println("]");
                break;
            }
            System.out.print(",");
        }
    }

}
