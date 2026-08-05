//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    public void log(int[] numbers, int[] names) {

        int[] copy = new int[numbers.length];
        for (int first:numbers) {
            System.out.println(first);
        }

        for (int first:numbers) {
            for(int second:numbers){
                System.out.println(first + "," + second);
            }
        }
    }

}