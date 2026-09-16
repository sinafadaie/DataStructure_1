package section_6.exercise_11;

import section_6.exercise_7.KeyValuePair;
import java.util.NoSuchElementException;

public class HashMapLinearProbe {
    public KeyValuePair[] coreArray;
    private int size;

    public HashMapLinearProbe(int size) {
        this.coreArray = new KeyValuePair[size];
        this.size = size;
    }

    public void put(int key, String value){

        if (getKeyValurPair(key) != null) {
            getKeyValurPair(key).setValue(value);
            return;
        }

        int freeIndex = hashFunction(key);
        for (var i = 0; i <= size * 2 ; i++){
            if (coreArray[freeIndex] == null || coreArray[freeIndex].getValue().equals("Deleted"))
                break;

            freeIndex = linearProb(i , key);
        }

        if (coreArray[freeIndex] != null)
            if (!coreArray[freeIndex].getValue().equals("Deleted"))     //if we write this by &
                throw new FullMapException();                           //we can get null pointer exception

        KeyValuePair keyValuePair = new KeyValuePair(key, value);
        coreArray[freeIndex] = keyValuePair;
    }

    private int linearProb(int i , int key) {
        return hashFunction(key + i);
    }

    public String get(int key){
        KeyValuePair keyValurPair = getKeyValurPair(key);

        if (keyValurPair == null)
            throw new NoSuchElementException();

        return keyValurPair.getValue();
    }

    public void remove(int key){
        KeyValuePair KeyValue = getKeyValurPair(key);

        if (KeyValue == null)
            return;

        KeyValue.setValue("Deleted");
    }

    private int hashFunction(int key){
        return key % size;
    }


    private KeyValuePair getKeyValurPair(int key){
        int indexValue = hashFunction(key);

        for(var i = 0; i <= size * 2 ; i++){
            if (coreArray[indexValue] == null)
                return null;

            if (coreArray[indexValue].getKey() == key )
                return coreArray[indexValue];

            indexValue = linearProb(i , key);
        }

        return null;
    }
}
