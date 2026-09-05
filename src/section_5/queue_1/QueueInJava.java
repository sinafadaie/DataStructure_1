package section_5.queue_1;

//Queue is an Interface in java
//"ArrayList" class implement the Queue Interface!
//another useful Queue obj is "ArrayDeque"
//it uses a "resizable array" under the hood!
//like what we do in next lesson.
//it is a queue with to entry (we can add both from the end and front)

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInJava {
    public void show(){
        Queue<Integer> queue= new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue.remove());
    }



}
