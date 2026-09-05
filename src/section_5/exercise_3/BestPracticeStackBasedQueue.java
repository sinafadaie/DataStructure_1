package section_5.exercise_3;

import section_5.exercise_2.FullQueueException;

import java.util.NoSuchElementException;
import java.util.Stack;

//in best practice enqueue is O(1)
//                 dequeue is O(n)
//------------
//primitive type should initiate on methods,
//but they can initiate automatically when they are fields
//When an object is created, all its fields must have some valid state.
//so java will initiate primitives (before call the constructor!)
//but in method we should initiate them manually
//reference type should initiate manually in any case!
//even by null

public class BestPracticeStackBasedQueue {
    private Stack<Integer> enqueueStack = new Stack<>();
    private Stack<Integer> dequeueStack = new Stack<>();
    private int numberOfItems ;
    private int size;

    public BestPracticeStackBasedQueue(int size) {
        this.size = size;
    }

    public void enqueue(int number){    //O(1)
        if (numberOfItems == size)
            throw new FullQueueException();
        enqueueStack.push(number);
        numberOfItems++;
    }

    public int deQueue(){               //O(n)
        if (isEmpty())
            throw new NoSuchElementException();

        if (dequeueStack.isEmpty()){
           while (!enqueueStack.isEmpty()){
               dequeueStack.push(enqueueStack.pop());
           }
        }

        numberOfItems--;
        return dequeueStack.pop();
    }

    public boolean isEmpty() {
        return numberOfItems == 0;
    }

    public  boolean isFull(){
        return numberOfItems == size;
    }

    public void print(){
        Stack<Integer> stack = new Stack<>();
        stack.addAll(dequeueStack);
        int counter = 1;                        //we need initial primitives on methods
                                                //on classes constructor do it automatically
        System.out.print("[");

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
            if (counter != numberOfItems)
                System.out.print(",");
            counter++;
        }

        for ( var item : enqueueStack){
            System.out.print(item);
            if (counter != numberOfItems)
                System.out.print(",");
            counter++;
        }

        System.out.println("]");
    }
}
