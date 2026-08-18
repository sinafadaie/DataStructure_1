package section_4.exercise_2;

import java.util.EmptyStackException;

public class ArrayBasedStack {
    private int[] array;
    private int currentLength;
    private int freeIndex;

    public ArrayBasedStack(int initialLength) {
        this.array = new int[initialLength];
        this.currentLength = initialLength;
    }

    public void push(int number){
        if (freeIndex >= currentLength)
            //throw new StackOverflowError();    //Mosh just throw exception
            increaseSize();
        array[freeIndex] = number;
        freeIndex ++;
    }

    public int pop(){
        if (freeIndex == 0)
            throw new EmptyStackException();

        freeIndex --;                   //the deleted item exists on array yet
        return array[freeIndex];        //it's not different we make it null or not
    }                                   //it used that memory any way! it's array!
                                        //if we use linked-list, we should really delete it

    public int peek(){
        if (freeIndex == 0)
            throw new EmptyStackException();

        return array[freeIndex - 1];
    }

    public boolean isEmpty(){
        return freeIndex == 0;
    }

    public void print(){
        System.out.print("[");
        for(int i=0; i < freeIndex; i++){
            System.out.print(array[i]);
            if (i == freeIndex - 1) {
                System.out.println("]");
                break;
            }
            System.out.print(",");
        }

    }

    private void increaseSize(){                //increase size 100%
        int[] tempArray = array;
        array = new int[currentLength * 2];
        currentLength = currentLength * 2;
        System.arraycopy(tempArray, 0, array, 0, tempArray.length);
    }

}
