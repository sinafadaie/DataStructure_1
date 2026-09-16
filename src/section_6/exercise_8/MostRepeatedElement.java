package section_6.exercise_8;
import java.util.HashMap;

//we have an array
//we want to find the most repeated element on this array
//HashMap is great solution!
//the cost is O(2n) = O(n)

public class MostRepeatedElement {
    public int mostRepeatedElement(int[] array){

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (var items : array)
            hashMap.put(items, hashMap.getOrDefault(items,0) + 1);   //if value is null
                                                                                //he use default value (0)

        int repeatedElement = -1;
        int maximumRepeat = 0;

        for (var pair : hashMap.entrySet()){
            if(pair.getValue() > maximumRepeat){
                repeatedElement = pair.getKey();
                maximumRepeat = pair.getValue();
            }
        }

        return repeatedElement;
    }
}
