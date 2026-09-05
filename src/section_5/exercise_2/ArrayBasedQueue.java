package section_5.exercise_2;

import java.util.NoSuchElementException;

public class ArrayBasedQueue {
    private int[] array;
    private int frontQueue = 0;
    private int backQueue = -1;
    private int size;

    public ArrayBasedQueue(int size) {
        this.array = new int[size];
        this.size = size;
    }

    public void enqueue(int number){           //O(n)
        if(isFull())
            throw new FullQueueException();

        if (backQueue + 1 == size)
            shift();

        array[++backQueue] = number;
    }

    public Integer dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
                                            //we don't remove the item
        return array[frontQueue++];         //just it not accessible anymore!
    }

    public Integer peek(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }

        return array[frontQueue];
    }

    public boolean isEmpty(){
        return backQueue < frontQueue;
    }

    public boolean isFull(){
        if (backQueue + 1 < size)
            return false;

        if (frontQueue == 0)
            return true;

        shift();
        return false;
    }

    public void print(){
        if (isEmpty()){
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (var i = frontQueue; i <= backQueue; i++){
            System.out.print(array[i]);
            if (i == backQueue) {
                System.out.println("]");
                break;
            }
            System.out.print(",");
        }
    }

    private void shift(){
        int[] tempArray = new int[size];
        int index = 0;
        for(var i = frontQueue; i <= backQueue; i++){
            tempArray[index++] = array[i];
        }
        array = tempArray;
        backQueue = backQueue - frontQueue;
        frontQueue = 0;
    }

}
