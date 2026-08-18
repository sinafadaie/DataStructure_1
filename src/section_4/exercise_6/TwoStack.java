package section_4.exercise_6;

import java.util.EmptyStackException;

public class TwoStack {
    int[] coreArray;
    int freeIndex1 ;
    int freeIndex2 ;        //start from last
    int stackSize;

    public TwoStack(int length) {
        this.coreArray = new int[length];
        this.stackSize = length;
        this.freeIndex2 = length-1;
    }

    public void push1 (int number){
        if (freeIndex1 > freeIndex2)
            throw new StackOverflowError();

        coreArray[freeIndex1] = number;
        freeIndex1 ++;
    }

    public void push2 (int number){
        if (freeIndex1 > freeIndex2)
            throw new StackOverflowError();

        coreArray[freeIndex2] = number;
        freeIndex2 --;
    }

    public int pop1(){
        if (freeIndex1 == 0)
            throw new EmptyStackException();

        int pop = coreArray[freeIndex1 - 1];
        freeIndex1 --;
        return pop;
    }

    public int pop2(){
        if (freeIndex2 == stackSize-1)
            throw new EmptyStackException();

        int pop = coreArray[freeIndex2 + 1];
        freeIndex2 ++;
        return pop;
    }

    public void print1(){
        System.out.print("[");
        for(int i=0; i < freeIndex1; i++){
            System.out.print(coreArray[i]);
            if (i == freeIndex1 - 1) {
                System.out.println("]");
                break;
            }
            System.out.print(",");
        }
    }

    public void print2(){
        System.out.print("[");
        for(int i = stackSize - 1; i > freeIndex2; i--){
            System.out.print(coreArray[i]);
            if (i == freeIndex2 + 1) {
                System.out.println("]");
                break;
            }
            System.out.print(",");
        }
    }

}
