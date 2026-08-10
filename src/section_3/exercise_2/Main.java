package section_3.exercise_2;

import java.util.Arrays;

public class Main {
    public  static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(4);
        linkedList.deleteFirst();
        linkedList.print();

        linkedList.addLast(7);
        linkedList.addLast(8);
        linkedList.print();

        linkedList.addFirst(0);
        linkedList.addFirst(1);
        linkedList.print();

        linkedList.deleteFirst();
        linkedList.print();

        linkedList.deleteLast();
        linkedList.print();

        System.out.println(linkedList.containOf(7));
        System.out.println(linkedList.indexOf(7));
        System.out.println(linkedList.getSize());

        int[] array = linkedList.toArray();
        System.out.println(Arrays.toString(array));
    }
}
