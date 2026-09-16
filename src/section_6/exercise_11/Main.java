package section_6.exercise_11;

public class Main {
    public static void main(String[] args){

        HashMapLinearProbe hashMap = new HashMapLinearProbe(100);

        hashMap.put(490046914 , "Sepehr");
        hashMap.put(490046914 , "Sina");    //overwrite the pre value
        hashMap.put(490046917 , "Leila");
        hashMap.put(490046919 , "Mom");
        hashMap.put(490046920 , "Jack");
        hashMap.put(590046914 , "Sin@");    //this use prob
                                            //he writes it on index of 15

        System.out.println(hashMap.get(490046914));

        hashMap.remove(490046914);
        hashMap.put(490046914 , "Sepehr");  //use debug mood to check the entire hashmap
    }

}
