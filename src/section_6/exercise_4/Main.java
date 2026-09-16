package section_6.exercise_4;

public class Main {
    public static void main(String[] args){
        FindFirstDuplicateCharacter findFirstDuplicateCharacter = new FindFirstDuplicateCharacter();

        Character firstDuplicateCharacter = findFirstDuplicateCharacter.findFirstDuplicateCharacter("green apple");
        System.out.println(firstDuplicateCharacter );
    }
}
