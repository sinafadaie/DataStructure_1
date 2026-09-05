package section_5.exercise_3;

import section_5.exercise_2.FullQueueException;

import java.util.NoSuchElementException;
import java.util.Stack;

//in this class each enqueue and dequeue
//are O(n), because we use mirror method
//the idea is when one of them modified (frontStack or backStack)
//we will update the other by mirror
//but this is not efficient

public class StackBasedQueue {
    private Stack<Integer> frontStack = new Stack<>();
    private Stack<Integer> backStack = new Stack<>();
    private int size;
    private int numberOfItems;

    public StackBasedQueue(int size) {
        this.size = size;
    }

    public void enqueue(int number){          //O(n)
        if (numberOfItems == size)
            throw new FullQueueException();
        backStack.push(number);
        numberOfItems++;
        frontStack = mirror(backStack);
    }

    public int dequeue(){                       //O(n)
        if (isEmpty())
            throw new NoSuchElementException();
        Integer pop = frontStack.pop();
        numberOfItems--;
        backStack = mirror(frontStack);
        return pop;
    }

    private Stack<Integer> mirror(Stack<Integer> stack){    //O(n)
        Stack<Integer> tempStack = new Stack<>();
        Stack<Integer> newStack = new Stack<>();
        tempStack.addAll(stack);

        for (var i = 0; i < numberOfItems; i++){
            newStack.push(tempStack.pop());
        }
        return newStack;
    }

    public void print(){
        System.out.println(backStack);
    }

    public boolean isEmpty(){
        return numberOfItems == 0;
    }

    public boolean isFull(){
        return numberOfItems == size;
    }

}
