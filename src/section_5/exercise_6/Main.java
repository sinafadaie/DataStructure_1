package section_5.exercise_6;

public class Main {
    public static void main(String[] args){
        PriorityQueue priorityQueue = new PriorityQueue(5);

        priorityQueue.enqueue(1);
        priorityQueue.enqueue(5);
        priorityQueue.enqueue(2);
        priorityQueue.enqueue(3);
        priorityQueue.enqueue(4);
        priorityQueue.print();

        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        priorityQueue.print();

        priorityQueue.enqueue(1);
        priorityQueue.enqueue(7);
        priorityQueue.print();

        System.out.println("-------");
        priorityQueue.dequeue();
        priorityQueue.dequeue();
        priorityQueue.dequeue();
        priorityQueue.dequeue();
        priorityQueue.dequeue();
        System.out.println(priorityQueue.isEmpty());

        priorityQueue.enqueue(1);
        priorityQueue.enqueue(5);
        priorityQueue.enqueue(2);
        priorityQueue.enqueue(3);
        priorityQueue.enqueue(4);
        priorityQueue.print();


    }
}
