package section_3.type_of_linkedList_5;

public class Main {
    public static void main(String[] args){
        DoublyLinkedList linkedList = new DoublyLinkedList();

        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.print();

        linkedList.deleteLast();        //O(1)
        linkedList.print();
    }
}
