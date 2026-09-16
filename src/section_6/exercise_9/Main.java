package section_6.exercise_9;

public class Main {
    public static void main(String[] args){
        int[] array = {1, 7, 5, 9, 2, 12, 3};

        CountPairsWithSpecificDiff countPairsWithSpecificDiff = new CountPairsWithSpecificDiff();
        int countedPairs = countPairsWithSpecificDiff.countPairsWithSpecificDiff(array, 2);
        System.out.println(countedPairs);

    }
}
