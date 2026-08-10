package section_3.exercise_8;

import section_3.exercise_2.LinkedList;
import section_3.exercise_2.Node;

import java.util.List;


public class MiddleOfLinkList {
    public List<Node> middleOfLinkList(LinkedList linkedList){

        if (!linkedList.hasElement())
            throw new IllegalArgumentException();

        Node firstMiddle = linkedList.getFirst();
        Node secondMiddle = linkedList.getFirst();
        Node node = linkedList.getFirst();
        int index = 1;

        while( node != null){
            if (index % 2 == 0)
                secondMiddle = secondMiddle.getNext();
            else
                firstMiddle = secondMiddle;

            node = node.getNext();
            index++;
        }

        if (secondMiddle == firstMiddle)
            return List.of(firstMiddle);
        else
            return List.of(firstMiddle,secondMiddle);
    }
}
