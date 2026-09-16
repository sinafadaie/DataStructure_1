package section_6.exercise_4;

import java.util.HashSet;

//we have string like "green apple"
//we want to find the first character that is duplicate
//"e" is the first duplicate character in our string
//------------
//we can use exercise_2 code too,
//but we use Set to solve it
//because we don't care really how many the character is duplicate (the exact number)
//we just want to know is he duplicate or not!

public class FindFirstDuplicateCharacter {

    public Character findFirstDuplicateCharacter(String string){

        HashSet<Character> hashSet = new HashSet<>();

        for (var character : string.toCharArray()){
            if (hashSet.contains(character))
                return character;
            hashSet.add(character);
        }

        return null;
    }
}
