package section_5.exercise_7;

public class Main {
    public static void main(String[] args){

        LinkedListBasedQueue queueBasedOnLinkedList = new LinkedListBasedQueue(5);
        queueBasedOnLinkedList.enqueue(1);
        queueBasedOnLinkedList.enqueue(2);
        queueBasedOnLinkedList.enqueue(3);
        queueBasedOnLinkedList.enqueue(4);
        queueBasedOnLinkedList.enqueue(5);

        System.out.println(queueBasedOnLinkedList.dequeue());
        queueBasedOnLinkedList.print();
    }
}
