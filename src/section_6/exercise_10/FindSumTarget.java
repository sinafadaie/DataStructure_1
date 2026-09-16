package section_6.exercise_10;

import java.util.HashMap;

public class FindSumTarget {
    public int[] findSumTarget(int[] array , int target ){

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int index =0;
        for(var item : array) {
            hashMap.put(item, index);
            index++;
        }

        for(var pair : hashMap.entrySet()){
           if(hashMap.containsKey( target - pair.getKey())){
               return new int[] {hashMap.get(pair.getKey()),hashMap.get(target - pair.getKey())};
            }
        }
        return null;
    }
}
