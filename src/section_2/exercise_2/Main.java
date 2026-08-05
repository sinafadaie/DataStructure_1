package section_2.exercise_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        var numbers = new DynamicArray(4);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(4);
        numbers.print();;

        numbers.insert(5);
        numbers.insert(6);
        numbers.insert(7);
        numbers.insert(8);
        numbers.insert(9);
        numbers.insert(10);
        numbers.print();

        numbers.removeAt(9);
        numbers.print();

        numbers.removeAt(8);
        numbers.print();

        System.out.println(numbers.indexOf(8));
    }
}
