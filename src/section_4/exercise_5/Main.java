package section_4.exercise_5;

public class Main {
    public static void main(String[] args){

        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(2);
        minStack.push(10);
        minStack.push(1);
        minStack.print();

        int min = minStack.min();
        System.out.println(min);

        minStack.pop();
        min = minStack.min();
        System.out.println(min);
    }
}
