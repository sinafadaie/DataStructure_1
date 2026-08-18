package section_4.exercise_3;

public class Main {
    public static void main(String[] args){
        String str = "abcd";

        StringReverser stringReverser = new StringReverser();
        String reverse = stringReverser.reverse(str);
        System.out.println(reverse);
    }
}
