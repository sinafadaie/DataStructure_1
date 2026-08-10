package section_3.exercise_7;

import section_3.exercise_2.LinkedList;
import section_3.exercise_2.Node;

public class Main {
    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addLast(50);

        KthNodeBasedLast kthNodeBasedLast = new KthNodeBasedLast();
        Node node = kthNodeBasedLast.kthNodeBaseLast(linkedList, 3);   //k(3)=30
        System.out.println(node.getValue());

        node = kthNodeBasedLast.kthNodeBaseLast(linkedList, 2);        //k(2)=40
        System.out.println(node.getValue());

        node = kthNodeBasedLast.kthNodeBaseLast(linkedList, 5);        //k(5)=10
        System.out.println(node.getValue());

    }
}
