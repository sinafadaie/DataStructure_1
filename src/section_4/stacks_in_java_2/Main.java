package section_4.stacks_in_java_2;

//Stack is generic in java
//it is in java.util package like other data structure
//-----------------
//Stack in Java is not linked-list-based.
//The standard java.util.Stack is array based because:
//Stack extends Vector,
//Vector stores elements in a resizable array (Vector is just a dynamic array)
//So java.util.Stack Implementation base: dynamic array
//Inheritance: Stack<E> extends Vector<E>

import java.util.Stack;

public class Main {
    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);


        Integer pop = stack.pop();
        System.out.println(pop);
        System.out.println(stack);

        System.out.println(stack.empty());

        Integer peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack);

        //--------------
        System.out.println(stack.search(20));       //in Java stack we have "search method"
                                                       //but it is not common
                                                       //we should not search the stack!

    }
}
