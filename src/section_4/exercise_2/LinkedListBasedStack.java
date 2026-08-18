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
        Node last = linkedList.getLast();
        linkedList.deleteLast();
        size--;
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
