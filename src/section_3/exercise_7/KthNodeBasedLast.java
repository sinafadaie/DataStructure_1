package section_3.exercise_7;

import section_3.exercise_2.LinkedList;
import section_3.exercise_2.Node;

//by using two extra pointer we can use one loop
//so the cost is O(n)

public class KthNodeBasedLast {
    public Node kthNodeBaseLast(LinkedList linkedList , int kth){

        if (kth <= 0)
            throw new IllegalArgumentException();

        if (!linkedList.hasElement())
            return linkedList.getFirst();                          //just null

        Node forwardPointer = linkedList.getFirst();
        Node backwardPointer = null;
        int index =0;

        while (forwardPointer != linkedList.getLast()){

            if (index == kth - 2)
                backwardPointer=linkedList.getFirst();

            if (index >= kth - 1){                                  //3th node from the end has 2 distance
                backwardPointer = backwardPointer.getNext();        //2th node from the end has 1 distance
            }                                                       //Kth node from the end has k-1 distance
            forwardPointer = forwardPointer.getNext();
            index++;
        }

        if (backwardPointer == null)
            throw new IllegalArgumentException();           //the linked list is too short!

        return backwardPointer;
    }
}
