package section_6.exercise_7;

public class Main {
    public static void main(String[] args){
        HashMap hashMap = new HashMap(100);

        hashMap.put(490046914 , "Sepehr");
        hashMap.put(490046914 , "Sina");

        System.out.println(hashMap.get(490046914));

        hashMap.remove(490046914);
    }
}
