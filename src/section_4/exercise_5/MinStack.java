package section_4.exercise_5;

import java.util.EmptyStackException;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int number){
        mainStack.push(number);
        addMin(number);
    }

    public void pop(){
        int peek = mainStack.peek();
        mainStack.pop();
        removeMin(peek);
    }

    public void peek(){
        mainStack.peek();
    }

    public int min(){
        return minStack.peek();
    }

    public void print(){
        System.out.println(mainStack);
    }

    private void addMin(int number){
        if (minStack.isEmpty()){
            minStack.push(number);
            return;
        }

        int min = minStack.peek();
        if (number <= min)
            minStack.push(number);
    }

    private void removeMin(int number){
        if(minStack.isEmpty())
            throw new EmptyStackException();

        int min = minStack.peek();
        if (number == min)
            minStack.pop();
    }

}
