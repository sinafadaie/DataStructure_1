package section_6.set_3;

//the most useful Set implementation is HashSet (the Set is an interface)
//we can use Set to make a duplicate list to unique list easily

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetInJava {

    public Set<Integer> set(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);

        Set<Integer> uniqueList = new HashSet<>(list);          //instead of use a for each loop
                                                                //we can initiate the set by the list
                                                                //with constructor

        return uniqueList;
    }


}
