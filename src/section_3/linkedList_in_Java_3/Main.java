package section_3.linkedList_in_Java_3;
import java.util.LinkedList;

//in Java, we have linked list class
//like what we implement in pre lesson manually!

public class Main {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();    //if we don't specify any class as generics
                                                                //we can store any kind of object in this list
                                                                //one node can hold Integer, the next one hold String!

        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        System.out.println(linkedList);

        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        boolean contains = linkedList.contains(10);
        System.out.println(contains);

        int index = linkedList.indexOf(10);
        System.out.println(index);

        int size = linkedList.size();
        System.out.println(size);

        var array = linkedList.toArray();       //we can convert the linkedList to Array
        System.out.println(array);              //like converting ArrayList to Arrays
    }
}
