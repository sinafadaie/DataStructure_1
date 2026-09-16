package section_6.exercise_10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] array = {2, 7, 11, 15};
        FindSumTarget findSumTarget = new FindSumTarget();

        var indexes = findSumTarget.findSumTarget(array, 9);
        System.out.println(Arrays.toString(indexes));


    }
}
