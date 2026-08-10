package section_3.exercise_8;

import section_3.exercise_2.LinkedList;
import section_3.exercise_2.Node;

import java.util.List;

public class Main {
    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addLast(50);
        linkedList.addLast(60);
        linkedList.addLast(70);
        linkedList.addLast(80);
        linkedList.addLast(90);

        MiddleOfLinkList middleOfLinkList = new MiddleOfLinkList();
        List<Node> nodes = middleOfLinkList.middleOfLinkList(linkedList);

        nodes.stream()
                .forEach(node -> {
                    System.out.println(node.getValue());
                });
    }
}
