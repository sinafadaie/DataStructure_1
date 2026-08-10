package section_3.exercise_6;

import section_3.exercise_2.LinkedList;

public class Main {
    public static void main(String[] args){

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.print();

        LinkedList reverse = reverseLinkedList.reverse(linkedList);
        reverse.print();
    }
}
