package section_6.exercise_2;

import java.util.HashMap;

//we have string like "a green apple"
//we want to find the first character that is unique
//"g" is the first unique character in our string
//---------------
//the if statement for checking the key is null or not (in line 18)
//is better to be
// if (!hashMap.containsKey(character))


public class FindTheFirstNonRepeatedCharacter {
    public Character findTheFirstNonRepeatedCharacter(String string){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        Character theCharacter = null;

        for(var character : string.toCharArray()){                  //if we want to don't use "toCharArray()"
            if (hashMap.get(character) == null) {                   //we should use "charAt()"
                hashMap.put(character, 1);                          //to iterate over String
                continue;
            }
            hashMap.put(character, hashMap.get(character) + 1);
        }


        for(var character : string.toCharArray()){                  //we can not iterate over hashtable here!
            if (hashMap.get(character) == 1){                       //because hashtable will not store the correct order
                theCharacter = character;                           //so we iterate over the string again
                break;
            }
        }

        return theCharacter;
    }
}
