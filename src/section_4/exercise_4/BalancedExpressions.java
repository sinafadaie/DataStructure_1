package section_4.exercise_4;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Map;
import java.util.Stack;

//the algorithm want to remove each pairs until stack is empty!
//the stack just store the open terms
//he deletes each open term from stack
//when he finds close term!

public class BalancedExpressions {

    List<Character> openTerms =  List.of('[','(','{','<');
    List<Character> closeTerms =  List.of(']',')','}','>');
    Map<Character, Character> map = Map.of(
            ')', '(',
            ']', '[',
            '}', '{',
            '>', '<'
    );

    Stack<Character> stack = new Stack<>();

    public boolean balanced(String expression){
        stack.clear();

        if (expression == null)
            throw new IllegalArgumentException();

        for (Character i : expression.toCharArray()){
            if ( openTerms.contains(i)){
                stack.push(i);                             //just push open terms on stack
                continue;
            }

            if ( closeTerms.contains(i)){                  //if the close term
                try {                                      //is not equal to pre related open term
                    if (!stack.pop().equals(map.get(i)))
                        return false;
                }
                catch (EmptyStackException e){             //if we have some close term
                    return false;                          //but there is not any open term
                }                                          //the stack will empty

            }
        }

        return stack.empty();

    }
}
