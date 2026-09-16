package section_6.hash_function_5;

public class SimpleHashFunction {
    public Integer hashFunction(String key){
        int hash = 0;

        for (var character : key.toCharArray()){
            hash = hash + character;    //because hash is integer
                                        //we have implicit casting here
                                        //java cast each character to a number (asci code )
        }
        return hash;    //if we use % here
                        //based on the array size
                        //we convert the hash value to index value
    }
}
