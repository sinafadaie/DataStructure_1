package section_4.exercise_6;

public class Main {
    public static void main(String[] args){
        TwoStack twoStack = new TwoStack(5);

        twoStack.push1(1);  //stack1
        twoStack.push1(2);

        twoStack.push2(3);  //stack2
        twoStack.push2(4);
        twoStack.push2(5);

        twoStack.print1();
        twoStack.print2();

        twoStack.pop1();
        twoStack.pop2();

        twoStack.print1();
        twoStack.print2();
    }
}
