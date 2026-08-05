package section_2.exercise_2;

import java.util.Arrays;

public class DynamicArray {
    private int[] list;
    private  int remainSpace;
    private  int freeIndex;
    private int currentSize;
    private int firstSize;

    public DynamicArray(int size) {
        list = new int[size];
        remainSpace = size;
        currentSize = size;
        firstSize = size;
        freeIndex = 0;
    }

    public void insert(int number){     //O(n)
        if (remainSpace == 0)
            increaseSize();
        list[freeIndex] = number;
        freeIndex++;
        remainSpace --;
    }

    //-----------------

    public void removeAt(int index){    //O(n)
        if (index > freeIndex || index < 0)
                throw new IllegalArgumentException();

        for (int i = index; i < freeIndex; i++){
            if(index == freeIndex-1){                   //if the item, is the last one
                list[freeIndex-1] = 0;                  //don't need any shift!
                break;
            }
            list[i] = list [i+1];
        }

        remainSpace ++;
        freeIndex--;
        decreaseSize();
    }

    //-----------------------

    public int indexOf(int number){         //O(n)
        for (int i=0; i<freeIndex; i++){
            if (list[i] == number)
                return i;
        }
        return -1;
    }

    public void print(){                    //O(n)
        System.out.println(Arrays.toString(list));
    }

    private void increaseSize() {
        int[] secondList = new int[currentSize + firstSize];
        for (int i = 0 ; i < freeIndex ; i++){
            secondList[i] = list[i];
        }
        remainSpace = firstSize;
        currentSize = currentSize + firstSize;
        list = secondList;                      //changed the address
    }

    private void decreaseSize(){
        if (remainSpace >= firstSize){          //we have extra space
            int[] secondList = new int[currentSize - firstSize];

            for (int i = 0; i< freeIndex; i++){
                secondList[i] = list[i];
            }

            currentSize = currentSize - firstSize;
            remainSpace = remainSpace - firstSize;
            list = secondList;
        }
    }
}
