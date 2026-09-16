package section_6.exercise_2;

public class Main {
    public static void main(String[] args){
        FindTheFirstNonRepeatedCharacter findTheFirstNonRepeatedCharacter = new FindTheFirstNonRepeatedCharacter();
        Character firstNonRepeatedCharacter = findTheFirstNonRepeatedCharacter.findTheFirstNonRepeatedCharacter("a green apple");

        System.out.println(firstNonRepeatedCharacter);
    }
}
