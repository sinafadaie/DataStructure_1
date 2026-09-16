package section_6.exercise_8;

public class Main {
    public static void main(String[] args){
        var list = new int[] {1, 2, 2, 3, 3, 3, 4};

        MostRepeatedElement mostRepeatedElement = new MostRepeatedElement();
        int most = mostRepeatedElement.mostRepeatedElement(list);

        System.out.println(most);

    }
}
