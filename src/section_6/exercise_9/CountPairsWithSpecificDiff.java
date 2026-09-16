package section_6.exercise_9;

import java.util.HashMap;

public class CountPairsWithSpecificDiff {

    public int countPairsWithSpecificDiff(int[] array, int k){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int counter = 0;

        for (var item : array)
            hashMap.put(item , item + k);       //it will remove duplicates pairs

        for (var pairs : hashMap.entrySet()){
            if (hashMap.containsKey(pairs.getValue())){     //O(1)
                counter++;                                  //because we check for the keys!
            }
        }

        return counter;
    }

}
