package section_5.exercise_4;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public void reverse(Queue<Integer> queue) {     //O(2n) = O(n)
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {          //we can not use for-each loop here!
            stack.push(queue.remove());     //because we can not modify the collection we are iterate
        }                                   //we will get "ConcurrentModificationException"

        while (!stack.isEmpty()) {          //we can not use for-each loop here!
            queue.add(stack.pop());         //Because for-each on stack creates an iterator.
        }                                   //Then stack.pop() changes the structure of the stack itself.
    }                                       //On the next iteration, the iterator detects that the collection was modified and throws ConcurrentModificationException.
}




