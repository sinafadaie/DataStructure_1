package section_4.exercise_3;

import java.util.Stack;

//we use Character class because
//we wnt process the String Character by Character

public class StringReverser {
    public String reverse(String string){

        Stack<Character> stack = new Stack<>();
        StringBuffer stringBuffer = new StringBuffer();     //if we use String, because he is immutable
                                                            //he creates new obj on each cycle
                                                            //so the memory will pollute!
                                                            //StringBuffer is String that mutable!

        for (Character i : string.toCharArray())            //we can not use for each loop on String
            stack.push(i);                                  //so we convert it to "CharArray"
                                                            //Array of Characters!

        while (!stack.empty()){
            stringBuffer.append(stack.pop());               //StringBuffer is mutable
        }                                                   //so it just use one obj

        return stringBuffer.toString();
    }
}
