package section_3.exercise_6;

import section_3.exercise_2.LinkedList;
import section_3.exercise_2.Node;

public class ReverseLinkedList {
    public LinkedList reverse(LinkedList linkedList){
        if (!linkedList.hasElement())
            return linkedList;

        Node node = linkedList.getFirst();
        LinkedList revereList = new LinkedList();

        Node lastNode = new Node(linkedList.getFirst().getValue());
        Node nextNode;  //we don't want to create another node
                        //nextNode just want to store the address

        nextNode = lastNode;
        int index = 0;
        while (node.getNext() !=null){
            Node newNode = new Node(node.getNext().getValue());
            newNode.setNext(nextNode);
            nextNode = newNode;
            node = node.getNext();
            index++;
        }

        revereList.setLast(lastNode);
        revereList.setFirst(nextNode);   //in last cycle in while loop
                                         //we store the newNode address in nextNode
        return revereList;
    }
}
