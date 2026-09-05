package section_5.exercise_3;

public class Main {
    public static void main(String[] args){
        /*
        StackBasedQueue stackBasedQueue = new StackBasedQueue(5);
        System.out.println(stackBasedQueue.isEmpty());
        System.out.println(stackBasedQueue.isFull());

        stackBasedQueue.enqueue(1);
        stackBasedQueue.enqueue(2);
        stackBasedQueue.enqueue(3);
        stackBasedQueue.enqueue(4);
        stackBasedQueue.enqueue(5);

        System.out.println(stackBasedQueue.isFull());
        stackBasedQueue.print();

        stackBasedQueue.dequeue();
        stackBasedQueue.enqueue(1);
        stackBasedQueue.print();
        */

        //-----------------

        BestPracticeStackBasedQueue bestPracticeStackBaseQueue = new BestPracticeStackBasedQueue(5);
        bestPracticeStackBaseQueue.enqueue(1);
        bestPracticeStackBaseQueue.enqueue(2);
        bestPracticeStackBaseQueue.enqueue(3);
        bestPracticeStackBaseQueue.enqueue(4);
        bestPracticeStackBaseQueue.enqueue(5);

        System.out.println(bestPracticeStackBaseQueue.isFull());
        bestPracticeStackBaseQueue.print();

        System.out.println(bestPracticeStackBaseQueue.isFull());

        bestPracticeStackBaseQueue.deQueue();
        bestPracticeStackBaseQueue.deQueue();
        bestPracticeStackBaseQueue.print();

        bestPracticeStackBaseQueue.enqueue(1);
        bestPracticeStackBaseQueue.enqueue(2);
        bestPracticeStackBaseQueue.print();
    }
}
