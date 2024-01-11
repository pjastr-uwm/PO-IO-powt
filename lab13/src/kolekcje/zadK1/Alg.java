package kolekcje.zadK1;

import java.util.HashMap;

public class Alg {

    public <K,V> HashMap<V, Integer> countValueOccurrences(HashMap<K, V> map){
        HashMap<V, Integer> temp = new HashMap<>();
        for(var value: map.values()){
            int counter =0;
            for(var value2: map.values()){
                if (value.equals(value2)){
                    counter++;
                }
            }
            temp.put(value, counter);
        }
        return temp;
    }
}
