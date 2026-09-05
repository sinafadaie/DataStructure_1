package section_5.exercise_8;

public class Main {
    public static void main(String[] args){
        QueueBasedStack stack = new QueueBasedStack(5);
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.print();

        System.out.println(stack.peek());
        stack.print();

        System.out.println(stack.pop());
        stack.print();

        stack.add(5);
        stack.print();
    }
}
