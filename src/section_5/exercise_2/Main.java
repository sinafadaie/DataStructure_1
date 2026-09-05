package section_5.exercise_2;


public class Main {
    public static void main(String[] args){
        ArrayBasedQueue arrayBasedQueue = new ArrayBasedQueue(5);
        System.out.println(arrayBasedQueue.isFull());
        System.out.println(arrayBasedQueue.isEmpty());
        System.out.println("------");

        arrayBasedQueue.enqueue(1);
        arrayBasedQueue.enqueue(2);
        arrayBasedQueue.enqueue(3);
        arrayBasedQueue.enqueue(4);
        arrayBasedQueue.enqueue(5);
        arrayBasedQueue.print();
        System.out.println(arrayBasedQueue.isFull());
        System.out.println(arrayBasedQueue.isEmpty());
        System.out.println("------");



        arrayBasedQueue.dequeue();
        System.out.println(arrayBasedQueue.isFull());       //the back item us on last index
        arrayBasedQueue.enqueue(1);                 //but queue is not full, so we need shift the array
        arrayBasedQueue.print();                            //we have private method!
        System.out.println("------");

        arrayBasedQueue.print();
        System.out.println(arrayBasedQueue.peek());
        System.out.println(arrayBasedQueue.isFull());
        arrayBasedQueue.dequeue();
        arrayBasedQueue.dequeue();
        arrayBasedQueue.dequeue();
        arrayBasedQueue.dequeue();
        arrayBasedQueue.dequeue();
        System.out.println(arrayBasedQueue.isEmpty());

        //-----------------------------
        System.out.println("------------");
        CycleArrayBasedQueue cycleArrayBasedQueue = new CycleArrayBasedQueue(5);
        cycleArrayBasedQueue.enqueue(1);
        cycleArrayBasedQueue.enqueue(2);
        cycleArrayBasedQueue.enqueue(3);
        cycleArrayBasedQueue.enqueue(4);
        cycleArrayBasedQueue.enqueue(5);
        cycleArrayBasedQueue.print();

        System.out.println("------------");
        System.out.println(cycleArrayBasedQueue.isFull());  //O(1)
        cycleArrayBasedQueue.dequeue();
        cycleArrayBasedQueue.enqueue(1);            //instead of shifting
        cycleArrayBasedQueue.print();                       //we will use cycle on Array
                                                            //it is important concept on Arrays!

    }
}
