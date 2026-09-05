package section_5.priority_queue_5;

import java.util.PriorityQueue;

//in JAVA PriorityQueue exist on java.util
//it will store based on the order of object on default
//smaller ones are the important one!

public class Main {
    public static void main(String[] args){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);       //it is smallest, so it is on front
        priorityQueue.add(3);
        priorityQueue.add(2);

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove());
        }
    }
}
