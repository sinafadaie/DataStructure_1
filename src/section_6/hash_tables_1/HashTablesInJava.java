package section_6.hash_tables_1;

import java.util.HashMap;
import java.util.Map;

//we have Map interface in JAVA
//we have HashMap class as most popular implementations,
//we have HashTable class that is too old, we don't use this implementation anymore
//we have ConcurrentHashMap class

public class HashTablesInJava {
    public void hashTableInJava(){
        Map<Integer, String> map = new HashMap<>();

        map.put(1,"Mosh");
        map.put(2,"Sina");
        map.put(3,"Leila");

        map.put(3,"Leil@");  //it will overwrite old value

        map.put(null,null);  //both key and value could be null!
                             //it is interview questions

        System.out.println(map);

        map.remove(null);
        System.out.println(map.get(1));

        map.containsKey(2);         //O(1)

        map.containsValue("Mosh");  //O(n), he need to iterate over!
                                    //he can not use hash function!

        for (var item : map.keySet()){  //we can not iterate directly on a map
            System.out.println(item);   //but we can iterate on keys
        }

        for (var item : map.entrySet()){  //or we can iterate on key/value pairs
            System.out.println(item);     //and get access on keys and values simultaneously
            System.out.println(item.getValue());
            System.out.println(item.getKey());
        }
    }


}
