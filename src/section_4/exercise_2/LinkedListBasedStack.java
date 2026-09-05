package section_4.exercise_2;


import section_3.exercise_2.LinkedList;
import section_3.exercise_2.Node;

public class LinkedListBasedStack {

    private LinkedList linkedList;
    private int size;


    public LinkedListBasedStack() {
        this.linkedList = new LinkedList();
    }

    public void push(int number){
        linkedList.addLast(number);
        size++;
    }

    public int pop(){
        Node last = linkedList.getLast();       //it is O(1) because java Linked-list is bidirectional
        linkedList.deleteLast();                //but if we have normal Linked-list it would be O(n)
        size--;                                 //delete last item is hard on normal linked-list
        return last.getValue();
    }

    public int peek(){
        return linkedList.getLast().getValue();
    }

    public boolean isEmpty(){
        return !linkedList.hasElement();
    }

    public void print(){
        linkedList.print();
    }
}
