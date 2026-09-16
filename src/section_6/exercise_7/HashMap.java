package section_6.exercise_7;

import java.util.LinkedList;

public class HashMap {
    public LinkedList<KeyValuePair>[] coreArray;
    private int size;

    public HashMap(int size) {
        this.coreArray = new LinkedList[size];
        this.size = size;
    }

    public void put(int key, String value){
        int indexValue = hashFunction(key);
        LinkedList<KeyValuePair> linkedList = getLinkedList(key);

        if (linkedList == null) {
            linkedList = new LinkedList<>();
            coreArray[indexValue] = linkedList;
        }

        var keyValuePair = getKeyValurPair(key);
        if (keyValuePair != null){               //when the key is already exist
            keyValuePair.setValue(value);        //and we need just an update!
            return;
        }

        linkedList.add(new KeyValuePair(key,value));
    }

    public String get(int key){
        LinkedList<KeyValuePair> linkedList = getLinkedList(key);

        if (linkedList == null)
            return null;

        return getKeyValurPair(key).getValue();
    }

    public void remove(int key){

        LinkedList<KeyValuePair> linkedList = getLinkedList(key);
        KeyValuePair KeyValue = getKeyValurPair(key);

        if (linkedList == null || KeyValue == null)
            return;

        linkedList.remove(KeyValue);
    }

    private int hashFunction(int key){
        return key % size;                  //it is better to use "Math.abs()"
    }                                       //to make key positive

    private LinkedList<KeyValuePair> getLinkedList(int key){
        int indexValue = hashFunction(key);
        LinkedList<KeyValuePair> linkedList;

        return coreArray[indexValue];               //it could be null
    }

    private KeyValuePair getKeyValurPair(int key){
        LinkedList<KeyValuePair> linkedList = getLinkedList(key);

        if (linkedList != null) {
            for (var keyValuePair : linkedList) {       //the best way to loop on JAVA Linked-List
                if (keyValuePair.getKey() == key)       //is for each loop
                    return keyValuePair;
            }
        }
        return null;
    }
}
