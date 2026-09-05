package section_5.exercise_6;

import section_5.exercise_2.FullQueueException;

import java.util.Arrays;
import java.util.NoSuchElementException;

//in this implementation
//frontQueue is cte, he is always in 0 index
//because we use shiftLeft()
//but it is not efficient!
//when we use Cycle-Array we should move it

public class PriorityQueue {
    private int[] array;
    private int frontQueue;
    private int backQueue = -1;
    private int size;
    private int numberOfItem;

    public PriorityQueue(int length) {
        this.array = new int[length];
        this.size = length;
    }

    public void enqueue(int number){            //O(n)
        if (size == numberOfItem)               //because he need to sort
            throw new FullQueueException();

        if (isEmpty()){                         //because the array initiate with 0
            array[0] = number;                  //we need insert first item manually!
            numberOfItem++;
            backQueue++;
            return;
        }

        int findIndex = frontQueue;
        for(int i = frontQueue; i <= backQueue; i++){
            if (array[i] > number)
                break;
            findIndex++;
        }

        shiftRight(findIndex);
        array[findIndex] = number;
        numberOfItem++;
        backQueue++;
    }

    public int dequeue(){                           //O(n)
        if (numberOfItem == 0)                      //it is not efficient, it should be O(1)
            throw  new NoSuchElementException();    //we can use Cycle-Array to make it O(1)

        int frontItem = array[frontQueue];
        shiftLeft();
        backQueue--;
        numberOfItem--;
        return frontItem;
    }

    public void print(){
        if (isEmpty())
            throw  new NoSuchElementException();

        int[] result = Arrays.stream(array, frontQueue, backQueue + 1)  //stream the array!
                .toArray();                                                         //to create sub array!
        System.out.println(Arrays.toString(result));
    }

    public boolean isEmpty(){
        return numberOfItem == 0;
    }

    private void shiftRight(int findIndex) {
        for(int i = backQueue ; i >= findIndex; i--){
            if (i == size - 1)
                continue;
            array[i+1] = array[i];
        }
    }

    private void shiftLeft() {
        for (int i = frontQueue + 1; i <= backQueue; i++ ){
            array[i-1] =array[i];
        }
    }
}
