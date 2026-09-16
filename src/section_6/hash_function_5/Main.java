package section_6.hash_function_5;

public class Main {
    public static void main(String[] args){
        SimpleHashFunction simpleHashFunction = new SimpleHashFunction();

        Integer hashed = simpleHashFunction.hashFunction("Sina");
        System.out.println(hashed);

        //------------------
        String key = "Sina";
        System.out.println(key.hashCode());     //every obj has hashCode()
                                                //java HashMap class use this method
                                                //as his hash function!
    }
}
