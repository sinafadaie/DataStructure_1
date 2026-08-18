package section_4.exercise_2;

public class Main {
    public static void main(String[] args){
        ArrayBasedStack arrayBasedStack = new ArrayBasedStack(5);
        System.out.println(arrayBasedStack.isEmpty());

        arrayBasedStack.push(1);
        arrayBasedStack.push(2);
        arrayBasedStack.push(3);
        arrayBasedStack.push(4);
        arrayBasedStack.push(5);
        arrayBasedStack.push(6);
        arrayBasedStack.push(7);
        arrayBasedStack.print();
        System.out.println("-------");

        System.out.println(arrayBasedStack.pop());
        arrayBasedStack.print();
        System.out.println("-------");

        System.out.println(arrayBasedStack.peek());
        arrayBasedStack.print();

        System.out.println(arrayBasedStack.isEmpty());

        //----------------------------

        LinkedListBasedStack linkedListBasedStack = new LinkedListBasedStack();
        linkedListBasedStack.push(1);
        linkedListBasedStack.push(2);
        linkedListBasedStack.push(3);
        linkedListBasedStack.push(4);
        linkedListBasedStack.push(5);
        linkedListBasedStack.push(6);
        linkedListBasedStack.print();

        System.out.println(linkedListBasedStack.peek());
        linkedListBasedStack.print();

        System.out.println(linkedListBasedStack.pop());
        linkedListBasedStack.print();

        System.out.println(linkedListBasedStack.isEmpty());


    }
}
